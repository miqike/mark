<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="../css/content.css" rel="stylesheet" />
	<link href="../css/jquery-easyui-theme/${theme}/easyui.css" rel="stylesheet" />
	<link href="../css/jquery-easyui-theme/icon.css" rel="stylesheet" />

	<script type="text/javascript" src="../js/jquery/jquery-1.11.1.min.js" ></script>
	<script type="text/javascript" src="../js/jquery.easyui.min.js" ></script>
	<script type="text/javascript" src="../js/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="../js/husky/husky.easyui.extend.depreciated.js" ></script>

	<script type="text/javascript" src="../js/husky/husky.common.depreciated.js"></script>
	<script type="text/javascript" src="../js/husky/husky.easyui.codeList.js"></script>

	<script type="text/javascript" src="../js/formatter.js"></script>
	<script type="text/javascript" src="./outboundInterface.js" ></script>
    <style type="text/css">
        #panel .datagrid-wrap{ border-width: 1px 0px 0px 0px;}
    </style>
</head>
<body style="padding:5px;">
<div id="panel" class="easyui-panel" title="">
    <div style="padding: 5px 10px 0px 10px">
			<p style="margin-top: 0px; margin-bottom: 5px;">
			关键字:<input id="f_key" style="margin-left:5px;margin-right:8px" value=""/>
			<span style="width:300px;">
			<a href="javascript:void(0);" id="btnSearch" class="easyui-linkbutton" plain="true" iconCls="icon-search">查找</a>
			<a href="javascript:void(0);" id="btnReset" class="easyui-linkbutton" plain="true" iconCls="icon2 r3_c10">重置</a>
			</span>
			</p>
		</div>

		<table id="mainGrid"
			class="easyui-datagrid" 
			data-options="singleSelect:false,collapsible:true,onClickRow:mainGridButtonHandler,
				method:'get',
				url:'../common/query?mapper=outboundInterfaceMapper&queryName=query',
				onLoadSuccess: loadSuccess,toolbar:mainGridToolbar,height:450,pagination:false">

			<thead>
				<tr>
					<th data-options="field:'interfaceCode',halign:'center',align:'center'" width="120" >接口码</th>
					<th data-options="field:'adapter',halign:'center',align:'center'" width="150">适配器</th>
					<th data-options="field:'serverAddress',halign:'center',align:'left'" width="250">地址</th>
					<th data-options="field:'postProcessor',halign:'center',align:'center'" width="150">业务对象</th>
					<th data-options="field:'sync',halign:'center',align:'center'" width="70" codeName="yesno" formatter="formatCodeList">同步</th>
					<th data-options="field:'remark',halign:'center',align:'center'" width="200">备注</th>
                    <th data-options="field:'status',halign:'center',align:'center'" sortable="true" width="70" codeName="interfaceStatus"
                        formatter="formatCodeList">状态</th>
				</tr>
			</thead>
			<tbody>
			</tbody>
		</table>
		<div id="mainGridToolbar">
            <a href="#" id="btnAdd" class="easyui-linkbutton" iconCls="icon-add" plain="true">新增</a>
            <a href="#" id="btnView" class="easyui-linkbutton" iconCls="icon-edit" plain="true" disabled="true">编辑/查看</a>
            <a href="#" id="btnLock" class="easyui-linkbutton" iconCls="icon2 r14_c1" plain="true" disabled="true">启用/禁用</a>
            <a href="#" id="btnInvalid" class="easyui-linkbutton" iconCls="icon2 r14_c1" plain="true" disabled="true">作废</a>
            <a href="#" id="btnDelete" class="easyui-linkbutton" iconCls="icon-remove" plain="true" disabled="true">删除</a>
		</div>
    </div>

	<div id="popWindow" class="easyui-window" title="接口定义"
		 data-options="modal:true,closed:true,iconCls:'icon-search'"
		 style="width: 750px; height: 440px; padding: 5px;">
        <div id="tabPanel" class="easyui-tabs" style="width:726px;clear:both;" data-options="onSelect:tabSelectHandler">
            <div title="基本信息" style="padding:5px;" selected="true">
                <table width="100%" id="interfaceTable">
                    <tr>
                        <td colspan="2">
                            <a href="javascript:void(0);" id="btnEditOrSave" class="easyui-linkbutton" iconCls="icon-edit"  plain="true">编辑</a>
                        </td>
                        <td colspan="2"></td>
                    </tr>
                    <tr>
                        <td style="text-align: right">接口代码</td>
                        <td><input class="easyui-textbox" id="p_interfaceCode" type="text"
                                   data-options="required:true,disabled:true" style="width:200px;"/>
                        </td>
                        <td style="text-align: right">组织机构</td>
                        <td><input class="easyui-textbox" id="p_orgId" data-options="required:true,disabled:true,iconWidth: 20,
										icons: [{
											iconCls:'icon2 r5_c16',
											handler: selectOrganization
										}]" style="width:200px;"/>
                        </td>
                    </tr>
                    <tr>
                        <td style="text-align: right">接口类型</td>
                        <td>
                            <input id="p_sync" class="easyui-combobox" codeName="interfaceType" style="width:70px;" data-options="disabled:true" />
                        <td style="text-align: right">重发</td>
                        <td>
                            <input id="p_recallLimits" class="easyui-numberspinner" style="width:200px;" data-options="required:true,disabled:true"/>
                        </td>
                    </tr>
                    <tr>
                        <td style="text-align: right">适配器</td>
                        <td>
                            <input class="easyui-combobox" id="p_adapter" codeName="outboundInterfaceBean" data-options="disabled:true" style="width:200px;"/>
                        </td>
                        <td style="text-align: right">业务类</td>
                        <td><input class="easyui-textbox" validType="email" id="p_postProcessor" type="text" style="width:200px;" data-options="disabled:true"/></td>
                    </tr>
                    <tr>
                        <td style="text-align: right">地址</td>
                        <td colspan="3"><input class="easyui-textbox" id="p_serverAddress" type="text" style="width:567px;" data-options="disabled:true"/>
                        </td>

                    </tr>
                    <tr>
                        <td style="text-align: right">WS方法</td>
                        <td>
                            <input id="p_method" class="easyui-textbox" style="width:200px;" data-options="required:true,disabled:true" />
                        </td>
                        <td style="text-align: right">Namespace</td>
                        <td>
                            <input id="p_namespace" class="easyui-textbox" style="width:200px;" data-options="disabled:true" />
                    </tr>
                    <tr>
                        <td style="text-align: right">用户名</td>
                        <td>
                            <input id="p_userName" class="easyui-textbox" style="width:200px;" data-options="disabled:true" />
                        <td style="text-align: right">密码</td>
                        <td>
                            <input id="p_passwd" class="easyui-textbox" style="width:200px;" data-options="required:true,disabled:true"/>
                        </td>
                    </tr>
                    <tr>
                        <td style="text-align: right">备注</td>
                        <td colspan="3">
                            <input id="p_remark" class="easyui-textbox" style="width:567px;" data-options="required:true,disabled:true" />
                        </td>
                    </tr>
                </table>
            </div>
            <div title="报文模板" style="width:700px;padding:5px;">
                <iframe id="template" style="height: 350px; width: 695px;"></iframe>
            </div>

        </div>
	</div>

    <!--<div id="orgTypeSelectDialog" class="easyui-dialog" style="width:250px;height:130px"
         data-options="title:'请选择是否财政单位',toolbar:'#tb',modal:true">
        <div style=";padding:20px">
            <input type="radio" name="isFinancial" value="1"/>是
            <input type="radio" name="isFinancial" value="0" selected/>否
            <a href="#" id="btnOrgTypeSelect" class="easyui-linkbutton" iconCls="icon-ok" plain="true">确认</a>
        </div>
    </div>-->
</body>
</html>