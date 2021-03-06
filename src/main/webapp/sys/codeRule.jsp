<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>编码规则</title>
    <link href="../css/content.css" rel="stylesheet"/>
    <link href="../css/themes/${theme}/easyui.css" rel="stylesheet"/>
    <link href="../css/themes/icon.css" rel="stylesheet"/>

    <script type="text/javascript" src="../js/jquery/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="../js/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="../js/jquery.nicescroll.min.js"></script>
    <script type="text/javascript" src="../js/husky/husky.common.depreciated.js"></script>
    <script type="text/javascript" src="../js/husky/husky.easyui.extend.depreciated.js"></script>

    <script type="text/javascript" src="./codeRule.js"></script>
</head>
<body>
<div class="noprint" style="margin:5px;height:540px;">
    <table id="mainGrid" class="easyui-datagrid" title="" style="width:900px;height:300px"
           data-options="
   		   		url:'../common/query?mapper=codeMapper&queryName=queryBMFS',
                fitColumns: true,
				method:'get',
				singleSelect:true,
				toolbar:'#mainGridToolbar',
				onClickRow:mainGridButtonHandler,
				pagination:false">
        <thead>
        <tr>
            <th data-options="field:'descn',halign:'center',align:'left',editor:'textbox'" width="70">编码名称</th>
            <th data-options="field:'literal',halign:'center',align:'left',editor:'textbox'" width="70">编码规则</th>
        </tr>
        </thead>
    </table>
    <div style="padding-left: 150px; padding-top:20px;text-align: center" >
        <table title="编辑" width="width:900px;">
            <tr>
                <td style="text-align: right">编码名称</td>
                <td>
                    <input type="hidden" id="value"/>
                    <input class="easyui-textbox" id="descn" data-options="required:true" style="width:200px;"/>
                </td>
                <td style="text-align: right">编码规则</td>
                <td><input class="easyui-textbox"  id="literal" data-options="required:true,validType:'codeRule'" style="width:200px;"/></td>
                <td><a id="btnSave" class="easyui-linkbutton" data-options="iconCls:'icon-save',width:70,plain:'true'">保存</a></td>
            </tr>
        </table>
    </div>
</div>

</body>
</html>
