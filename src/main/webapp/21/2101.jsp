<%--jsp文件的存储格式--%>
<%--<%@ page language="java" pageEncoding="UTF-8"%>--%>
<%--解码格式--%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <%--控制浏览器的解码方式。如果前面的解码都一致并且无误的话，这个编码格式用不用设置都可以--%>
    <%--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">--%>
    <title>市场主体管理</title>
    <link href="../css/content.css" rel="stylesheet"/>
    <link href="../css/themes/${theme}/easyui.css" rel="stylesheet"/>
    <link href="../css/themes/icon.css" rel="stylesheet"/>
    <link rel="stylesheet" href="../css/zTreeStyle/zTreeStyle.css" type="text/css">
    <link rel="stylesheet" href="../js/jeasyui-extensions/jeasyui.extensions.css" type="text/css">

    <script type="text/javascript" src="../js/hotkeys.min.js"></script>
    <script type="text/javascript" src="../js/jquery.min.js"></script>
    <script type="text/javascript" src="../js/jquery.jdirk.min.js"></script>
    <script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="../js/jeasyui-extensions/jeasyui.extensions.js"></script>
    <script type="text/javascript" src="../js/jeasyui-extensions/jeasyui.extensions.menu.js"></script>
    <script type="text/javascript" src="../js/jeasyui-extensions/jeasyui.extensions.panel.js"></script>
    <script type="text/javascript" src="../js/jeasyui-extensions/jeasyui.extensions.datagrid.js"></script>
    <script type="text/javascript" src="../js/jquery.nicescroll.min.js"></script>
    
    
    <script type="text/javascript" src="../js/husky.orgTree.js"></script>
    <script type="text/javascript" src="../js/husky.easyui.extend.js"></script>

    <script type="text/javascript" src="../js/jquery.ztree.core-3.5.min.js"></script>
    <script type="text/javascript" src="../js/jquery.ztree.excheck-3.5.min.js"></script>
    <script type="text/javascript" src="../js/husky.common.js"></script>
    <script type="text/javascript" src="../js/husky.easyui.codeList.js"></script>
    <script type="text/javascript" src="../js/underscore-min-1.8.3.js"></script>
    <script type="text/javascript" src="./2101.js"></script>
    <style>
    	td.label{text-align: right}
        body {
            margin:0;
            padding:0;
            font:13px/1.5 \5b8b\4f53, Arial, sans-serif;
            background:#ffffff;
        }

        div .datagrid-wrap{ border-right: 0px; border-left: 0px; border-bottom: 0px}

        div#tabPanel .datagrid-wrap{ border-top: 0px;}
    </style>
</head>
<body style="padding:5px;">
<%-- <shiro:hasPermission name="user"> --%>
<div id="panel" class="easyui-panel" title="" style="overflow: hidden;height:600px;">
	<div id="layout" class="easyui-layout" data-options="fit:true">
		
		<div data-options="region:'west',split:true" title="单位列表" style="width:240px;">
			<ul id="orgTree" class="ztree"></ul>
		</div>
		<div data-options="region:'center'">
		
			<div style="padding: 5px 10px 0px 10px">
				<table id="queryTable">
					<tr>
						<td class="label">计划年度</td>
						<td><input id="f_businessKey" class="easyui-textbox"/></td>
						<td class="label">计划编号</td>
						<td><input id="f_errorNo" class="easyui-textbox"/></td>
						<td class="label">抽查人员</td>
						<td><input id="f_operator" class="easyui-textbox"/></td>
					</tr>
					<tr>
						<td class="label">企业名称</td>
						<td><input id="f_module" class="easyui-textbox"/></td>
						<td class="label">统一社会信用代码</td>
						<td><input id="f_deptName" class="easyui-combobox" codeName="hcnr"
							data-options="panelHeight:120,width:150" style="" /></td>
						<td class="label">行业分类</td>
						<td><input id="f_module" class="easyui-textbox"/></td>
					</tr>
					<tr>
						<td class="label">区域</td>
						<td><input id="f_deptName" class="easyui-combobox" codeName="hcnr"
							data-options="panelHeight:120,width:150" style="" /></td>
						<td class="label">组织形式</td>
						<td><input id="f_module" class="easyui-textbox"/></td>
						<td class="label">经营状态</td>
						<td><input id="f_deptName" class="easyui-combobox" codeName="hcnr"
							data-options="panelHeight:120,width:150" style="" /></td>
					</tr>
					<tr>
						<td class="label">抽查结果</td>
						<td><input id="f_deptName" class="easyui-combobox" codeName="hcfl"
							data-options="panelHeight:120,width:100" style="" /></td>
							
						<td>
							<input type="radio" ></input> 全部
							<input type="radio" ></input> 按抽查计划
							
						</td>
						
						<td>
							<input type="radio" ></input> 定向
							<input type="radio" ></input> 不定向
							
						</td>
						
						<td colspan="2" style="text-align-right;">
							<a href="javascript:void(0);" id="btnSearch" class="easyui-linkbutton" plain="true" iconCls="icon-search">查找</a>
							<a href="javascript:void(0);" id="btnReset" class="easyui-linkbutton" plain="true" iconCls="icon2 r3_c10">重置</a>
						</td>
					</tr>
				</table>
			</div>
		
		    <table id="mainGrid"
		           class="easyui-datagrid"
		           data-options="collapsible:true,onClickRow:mainGridButtonHandler,
		           		offset: { width: 0, height: 0},
						ctrlSelect:true,method:'get',onDblClickRow:mainGridDblClickHandler,
						toolbar: '#mainGridToolbar',
		           		pageSize: 20, pagination: true"
		           pagePosition ="bottom" >
		        <thead>
		        <tr>
		            <!--<th data-options="field:'id',halign:'center',align:'center'" sortable="true" width="70">ID</th>-->
		            <th data-options="field:'zch',halign:'center',align:'left'" sortable="true" width="100">登记机关</th>
		            <th data-options="field:'mc',halign:'center',align:'left'" sortable="true" width="100">检查机关</th>
		            <th data-options="field:'lx',halign:'center',align:'center'" sortable="true" width="70">所在区域</th>
		            <th data-options="field:'fr',halign:'center',align:'center'" sortable="true" width="70">信用代码</th>
		            <th data-options="field:'clrq',halign:'center',align:'right'" sortable="true" width="150">企业(机构)名称</th>
		            <th data-options="field:'zczb',halign:'center',align:'right'" sortable="true" width="100">市场主体类型</th>
		            <th data-options="field:'djjgmc',halign:'center',align:'right'" sortable="true" width="100">行业分类</th>
		            <th data-options="field:'djzt',halign:'center',align:'center'" sortable="true" width="100" codeName="userStatus"
		                formatter="formatCodeList">组织形式</th>
		            <th data-options="field:'djzt',halign:'center',align:'center'" sortable="true" width="100" codeName="userStatus"
		                formatter="formatCodeList">经营状态</th>
		            <th data-options="field:'djjgmc',halign:'center',align:'right'" sortable="true" width="100">法人代表/负责人</th>
		            <th data-options="field:'djjgmc',halign:'center',align:'right'" sortable="true" width="100">联系电话</th>
		            <th data-options="field:'djjgmc',halign:'center',align:'right'" sortable="true" width="150">电子邮箱</th>
		            <th data-options="field:'djjgmc',halign:'center',align:'right'" sortable="true" width="70">工商联络员</th>
		        </tr>
		        </thead>
		        <tbody>
		        </tbody>
		    </table>
		    <div id="mainGridToolbar">
		        <a href="#" id="btnView" class="easyui-linkbutton" iconCls="icon-edit" plain="true">抽查记录</a>
		    </div>
		</div>
	</div>
	
</div>
<!-- --------弹出窗口--------------- -->

<div id="examHistory" class="easyui-window" title="企业抽查记录"
     data-options="modal:true,closed:true,iconCls:'icon-search'"
     style="width: 750px; height: 400px; padding: 10px;">
     <table id="grid2"
           class="easyui-datagrid"
           data-options="
               singleSelect:true,
               collapsible:true,
               selectOnCheck:false,
               checkOnSelect:false"
           toolbar="#grid2Toolbar"
           style="height: 318px">
        <thead>
        <tr>
            <th data-options="field:'name'" halign="center" align="center" width="30">序号</th>
            <th data-options="field:'role'" halign="center" align="left" width="100">抽查计划编号</th>
            <th data-options="field:'role'" halign="center" align="left" width="100">抽查计划下达时间</th>
            <th data-options="field:'status',halign:'center',align:'center'" sortable="true" width="70" codeName="roleStatus"
                formatter="formatCodeList">抽查类型</th>
            <th data-options="field:'role'" halign="center" align="left" width="100">抽查机关</th>
            <th data-options="field:'role'" halign="center" align="left" width="100">抽查人员</th>
            <th data-options="field:'role'" halign="center" align="left" width="100">抽查结果</th>
            <th data-options="field:'role'" halign="center" align="left" width="100">经营状态</th>
            <th data-options="field:'role'" halign="center" align="left" width="100">抽查结果公示情况</th>
        </tr>
        </thead>
    </table>
</div>
</body>
</html>