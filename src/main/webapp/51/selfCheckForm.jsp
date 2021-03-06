<%@ page contentType="text/html; charset=UTF-8" %>
<script>
    function saveDocSelfCheck() {
        var hcrw=$("#grid2").datagrid("getSelected");

        $.getJSON("../common/query?mapper=hcclMapper&queryName=getDXNHcsx",null,function(response){
            var data = {};
            data.hcdwXydm = hcrw.HCDW_XYDM;
            data.hcjhnd = hcrw.JHND;
            data.name ="企业公示信息自查表";
            data.hcclId = response.rows[0].ID;
            data.hcsxId = response.rows[0].HCSX_ID;
            data.hcrwId = hcrw.ID;
            data.sfbyx = response.rows[0].SFBYX;
            data.wjlx = response.rows[0].WJLX;
            data.yhtg = 1;
            data.ly = 2;
            data.hcsxmc = response.rows[0].HCSXMC;
            data.mongoId = $("#self_mongoId").val();

            data.id=null;
            var url = "../51/hcclmx";

            $.ajax({
                url: url,
                type: "POST",
                data: data,
                success: function (response) {
                    if (response.status == $.husky.SUCCESS) {
                        $.messager.show('提示',"检查材料保存成功", "info", "bottomRight");
                        $("#selfCheckDocumentWindow").window("close");
                        grid1ClickHandler();
                    } else {
                        $.messager.alert('检查材料保存失败', response.message+"[可能的原因有：数值格式错误；日期格式错误yyyy-MM-dd]", 'error');
                    }
                }
            });
        });
    }

    function doInitSelfCheck() {
        var hcrw=$("#grid2").datagrid("getSelected");

        $.getJSON("../common/query?mapper=hcclMapper&queryName=getDXNHcsx",null,function(response){
            $("#self_id").val(response.rows[0].HCSX_ID);
            $("#self_name").val("企业公示信息自查表");
            $("#self_hcsxmc").val(response.rows[0].HCSXMC);
        });
        $("#self_type").val(1);
        $("#self_hcjhnd").val(hcrw.JHND);
        $("#self_hcdwXydm").val(hcrw.HCDW_XYDM);
        $.getScript("../js/fileuploader.js", function () {
            window.uploaderSelfCheck = new qq.FileUploaderBasic({
                button: document.getElementById('btnUploadSelfCheck'),
                validation: {allowedExtensions: ['xls', 'xlsx'],
                    sizeLimit: 204800 // 200 kB = 200 * 1024 bytes
                },
                action: '../selfCheckUpload',
                multiple: false,
                debug: false,

                onSubmit: function (id, fileName) {
                    uploaderSelfCheck.setParams({
                        owner: "AUTHOR",
                        col: "BI0511",
                        ownerKey: "#datagridBi05",
                        hcrwId:hcrw.ID
                    });
                    $("#progressbarSelfCheck").show().width('260px');
                },

                onProgress: function (id, fileName, loaded, total) {
                    var percentLoaded = (loaded / total) * 100;
                    $("#progressbarSelfCheck").progressBar(percentLoaded);
                    $("#btnSaveDocSelfCheck").linkbutton("disable");
                },
                // display a fancy message
                onComplete: function (id, fileName, response) {
                    if(response.status==1){
                        $("#self_mongoId").val(response.mongoId);
                        $("#progressbarSelfCheck").hide();
                        $("#btnSaveDocSelfCheck").linkbutton("enable");
                    }else{
                        $.messager.show("操作提醒",response.message, "info", "bottomRight");
                    }
                }
            });
        });
		
    }

    $(function () {
    	$.codeListLoader.parse($('#selfCheckDocPanel'))
    });
</script>

<table>
    <tr>
        <td class="label">检查计划年度</td>
        <td>
            <input type="hidden" id="self_id"/>
            <input type="hidden" id="self_mongoId"/>
            <input type="hidden" id="self_type"/><!-- 1:标准材料 2:附加材料 -->
            <input class="hidden"  id="self_hcjhnd" disabled/>
        <td class="label">统一社会信用代码</td>
        <td><input class="easyui-validatebox" id="self_hcdwXydm" disabled/></td>
    </tr>
    <tr>
        <td class="label">检查事项名称</td>
        <td><input class="easyui-validatebox" id="self_hcsxmc" data-options="" disabled/></td>
        <td class="label">检查材料名称</td>
        <td><input class="easyui-validatebox" id="self_name" data-options="" disabled/></td>
    </tr>

</table>
<a plain="true" iconcls="icon2 r1_c13" class="l-btn l-btn-small l-btn-plain" id="btnUploadSelfCheck" href="#" group="" style="position: relative; overflow: hidden; direction: ltr;">
	<span class="l-btn-left l-btn-icon-left">
	<span class="l-btn-text">选择文件</span>
		<span class="l-btn-icon icon2 r1_c13">&nbsp;</span>
	</span>
	<input type="file" name="file" style="position: absolute; right: 0px; top: 0px; font-family: Arial; font-size: 118px; margin: 0px; padding: 0px; cursor: pointer; opacity: 0;">
</a>

<a href="#" id="btnSaveDocSelfCheck" class="easyui-linkbutton" iconCls="icon-save" plain="true" disabled>保存</a>
<div id="_docPanelSelfCheck" style="padding:10px;"></div>
<div id="progressbarSelfCheck" style='margin-bottom:10px;display:none'></div>
