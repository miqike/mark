<%@ page contentType="text/html; charset=UTF-8" %>
<script>
    function auditHcwr() {
        var hcrw = $("#grid2").datagrid("getSelected");
        var data = {};
        data.id = hcrw.id;
        data.hcjieguo = $("#d_hcjieguo").combobox("getValue");
        data.auditResult = $("#d_auditResult").combobox("getValue");
        data.auditComment = $("#d_auditComment").val();
        $.ajax({
            url: "../51/" + hcrw.id + "/audit",
            type: "POST",
            data: data,
            success: function (response) {
                if (response.status == $.husky.SUCCESS) {
                	//doDocListInit();
                    $.messager.show('提示',"检查结果审核成功", "info", "bottomRight");
                    //$("#documentWindow").window("close");
                } else {
                    $.messager.alert('检查结果审核失败', response.message, 'error');
                }
            }
        });
    }

    function doAuditFormInit() {
    	$.husky.loadForm("auditTable", $("#grid2").datagrid("getSelected"));
    } 

    $(function () {
    	$.codeListLoader.parse($('#auditTable'))
    });
</script>
<div style="padding:5px;">
	<table id="auditTable">
	    <tr>
	        <td class="label">检查机关</td>
	        <td colspan="3">
	            <input class="easyui-validatebox" id="d_hcjgmc" style="width:337px;" disabled/>
	    </tr>
	    <tr>
	        <td class="label">企业名称</td>
	        <td colspan="3"><input class="easyui-validatebox" id="d_hcdwName" style="width:337px;" codeName="yesno"  disabled/></td>
	    </tr>
	    <tr>
	        <td class="label">统一社会信用代码</td>
	        <td><input class="easyui-validatebox" id="d_hcdwXydm" disabled/></td>
	        <td class="label">检查时间</td>
	        <td><input class="easyui-datebox" id="d_sjwcrq" data-options="" disabled/></td>
	    </tr>
	    <tr>
	        <td class="label">核查结果</td>
	        <td colspan="3"><input class="easyui-combobox" id="d_hcjieguo" data-options="panelHeight:180" style="width:346px;" codeName="gsjg" /></td>
	    </tr>
	    <tr>
	        <td class="label">是否列入经营异常名录</td>
	        <td><input class="easyui-combobox" id="d_auditResult" data-options="panelHeight:60" codeName="yesno" /></td>
	    </tr>
	    <tr>
	        <td class="label">审核人</td>
	        <td><input class="easyui-validatebox" id="d_auditorName" data-options="" disabled/></td>
	        <td class="label">审核日期</td>
	        <td><input class="easyui-datebox" id="d_hcjieguo" data-options="" disabled/></td>
	    </tr>
	    <tr>
	        <td class="label" valign="top">审核意见</td>
	        <td colspan="3">
	        	<textarea id="d_auditComment" data-options=""  style="width:340px;" />
	        </td>
	    </tr>
	    
	</table>
</div>