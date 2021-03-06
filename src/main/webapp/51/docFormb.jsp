<%@ page contentType="text/html; charset=UTF-8" %>
<script>
    function saveDoc() {
    	var type = $("#d_type").val();
        $("#btnSaveDoc").linkbutton("disable");
        var hcsx = type==1? $("#docGrid").datagrid("getSelected"): $("#furDocgrid").datagrid("getSelected");
        var data = {};
        data.hcdwXydm = hcsx.HCDW_XYDM;
        data.hcjhnd = hcsx.HCJHND;
        data.name = type==1? hcsx.HCCL_NAME: hcsx.NAME;
        data.hcclId = hcsx.HCCL_ID;
        data.hcsxId = hcsx.HCSX_ID;
        data.hcrwId = hcsx.HCRW_ID;
        data.sfbyx = hcsx.SFBYX;
        data.wjlx = hcsx.WJLX;
        data.yhtg = 1;
        data.ly = 2;
        data.hcsxmc = hcsx.HCSXMC;
        data.mongoId = $("#d_mongoId").val();
        
        if(type == 2) data.id=hcsx.ID;
        var url = type == 1?  "../51/hcclmx" : "../51/docFur2";
        
        $.ajax({
            url: url,
            type: "POST",
            data: data,
            success: function (response) {
                if (response.status == $.husky.SUCCESS) {
                	doDocListInit();
                    $.messager.show('提示',"检查材料保存成功", "info", "bottomRight");
                    $("#documentWindow").window("close");
                } else {
                    $.messager.alert('检查材料保存失败', response.message, 'error');
                }
            }
        });
    }

    function doInit(type) {
    	var hcsx = null;
        var hcrw=$("#grid2").datagrid("getSelected");
		if(type == 1) { //标准
	        hcsx = $("#docGrid").datagrid("getSelected");
	        $("#d_name").val(hcsx.HCCL_NAME);
		} else { //附加
			 hcsx = $("#furDocgrid").datagrid("getSelected");
			 $("#d_id").val(hcsx.ID);
			 $("#d_name").val(hcsx.NAME);
		}
        /*if(type==1){
            var row=$('#docGrid').datagrid("getSelected");
            $.get("../selfCheckUpload/dxnHccl", {"dxnType": 2}, function (response) {
                if (response.status == $.husky.SUCCESS && response.data.NAME==row.HCCL_NAME && response.data.HCSXMC==row.HCSXMC){
                    $("#trNd").show();
                }else{
                    $("#trNd").hide();
                }
            });
        }else {
            $("#trNd").hide();
        }
*/
        $("#d_type").val(type);
        $("#d_hcjhnd").val(hcsx.HCJHND);
        $("#d_hcdwXydm").val(hcsx.HCDW_XYDM);
        $("#d_hcsxmc").val(hcsx.HCSXMC);
        $("#d_nd").val(hcrw.ND);
        setTimeout(function() {
	        $("#d_sfbyx").combobox("setValue", hcsx.SFBYX);
    	    $("#d_wjlx").combobox("setValue", hcsx.WJLX);
        	
        }, 300);

        $.getScript("../js/fileuploader.js", function () {
            window.uploader = new qq.FileUploaderBasic({
                button: document.getElementById('btnUpload'),
                allowedExtensions: [],
                action: '../selfCheckUpload',
//                action: '../ajaxUpload',
                multiple: false,
                debug: false,

                onSubmit: function (id, fileName) {
                    uploader.setParams({
                        owner: "AUTHOR",
                        col: "BI0511",
                        ownerKey: "#datagridBi05",
                        hcrwId:hcrw.ID,
                        hcclName:type == 1?hcsx.HCCL_NAME:hcsx.NAME,
                        hcsxmc:hcsx.HCSXMC,
                        nd:$("#d_nd").val()
                    });
                    $("#progressbar").show().width('260px');
                },

                onProgress: function (id, fileName, loaded, total) {
                    var percentLoaded = (loaded / total) * 100;
                    $("#progressbar").progressBar(percentLoaded);
                    $("#btnSaveDoc").linkbutton("disable");
                },
                // display a fancy message
                onComplete: function (id, fileName, response) {
                    if(response.status==1){
                        $("#d_mongoId").val(response.mongoId);
                        $("#progressbar").hide();
                        $("#btnSaveDoc").linkbutton("enable");
                    }else{
                        $.messager.alert('自查表保存失败', response.message, 'error');
                    }
                }
            });
        });
		
    }

    $(function () {
    	$.codeListLoader.parse($('#docPanel'));
    });
</script>

<table>
    <tr>
        <td class="label">检查计划年度</td>
        <td>
            <input type="hidden" id="d_id"/>
            <input type="hidden" id="d_mongoId"/>
            <input type="hidden" id="d_type"/><!-- 1:标准材料 2:附加材料 -->
            <input class="easyui-validatebox" , id="d_hcjhnd" disabled/>
        <td class="label">统一社会信用代码</td>
        <td><input class="easyui-validatebox" id="d_hcdwXydm" disabled/></td>
    </tr>
    <tr>
        <td class="label">检查事项名称</td>
        <td><input class="easyui-validatebox" id="d_hcsxmc" data-options="" disabled/></td>
        <td class="label">检查材料名称</td>
        <td><input class="easyui-validatebox" id="d_name" data-options="" disabled/></td>
    </tr>
    <tr>
        <td class="label">是否必要项</td>
        <td><input class="easyui-combobox" id="d_sfbyx" data-options="" codeName="yesno"  disabled/></td>
        <td class="label">文件类型</td>
        <td><input class="easyui-combobox" id="d_wjlx" data-options="" codeName="wjlx" disabled /></td>
    </tr>
    <tr id="trNd">
        <td class="label">年报年度</td>
        <td><input class="easyui-validatebox" id="d_nd" data-options="" disabled/></td>
    </tr>

    <!-- 
    <th data-options="field:'HCCL_NAME',halign:'center',align:'left'" sortable="true" width="110">检查材料名称</th>
            <th data-options="field:'HCSXMC',halign:'center',align:'left'" sortable="true" width="100">检查事项</th>
            <th data-options="field:'SFBYX',halign:'center',align:'center'" sortable="true" width="70" codeName="yesno" styler="sfbyStyler">是否必要项</th>
            <th data-options="field:'WJLX',halign:'center',align:'center'" sortable="true" width="100" codeName="wjlx" >文件类型</th>
            <th data-options="field:'UPLOAD_TIME',halign:'center',align:'center'" sortable="true" width="110" formatter="formatDatetime2Min" >上传时间</th>
            <th data-options="field:'id',halign:'center',align:'center'" sortable="true" width="70"  formatter="formatDocOperation">操作</th> -->
            
</table>
<a plain="true" iconcls="icon2 r1_c13" class="l-btn l-btn-small l-btn-plain" id="btnUpload" href="#" group="" style="position: relative; overflow: hidden; direction: ltr;">
	<span class="l-btn-left l-btn-icon-left">
	<span class="l-btn-text">选择文件</span>
		<span class="l-btn-icon icon2 r1_c13">&nbsp;</span>
	</span>
	<input type="file" name="file" style="position: absolute; right: 0px; top: 0px; font-family: Arial; font-size: 118px; margin: 0px; padding: 0px; cursor: pointer; opacity: 0;">
</a>

<a href="#" id="btnSaveDoc" class="easyui-linkbutton" iconCls="icon-save" plain="true" disabled>保存</a>
<div id="_docPanel" style="padding:10px;"></div>
<div id="progressbar" style='margin-bottom:10px;display:none'></div>
