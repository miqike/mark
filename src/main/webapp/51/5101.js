

function collapseHandler() {
	$("div.datagrid-view:not(:last)").parent().css("border-right-width", "1px")
	$("div.datagrid-view:nth-child(1)").parent().css("border-bottom-width", "1px")
}

function expandHandler() {
	$("div.datagrid-view:not(:last)").parent().css("border-right-width", "0px")
	$("div.datagrid-view:nth-child(1)").parent().css("border-bottom-width", "0px")
}

function mainGridButtonHandler() {
	if($('#mainGrid').datagrid('getSelected') != null) {
		$('#btnAudit').linkbutton('enable');
	} else {
		$('#btnAudit').linkbutton('disable');
	}
}

function mainGridDblClickHandler(index,row) {
	window.selected = index;
	$('#mainGrid').datagrid('unselectAll').datagrid('selectRow', window.selected);
	$("#p_userId").textbox("setValue", row.userId).textbox("readonly", "true");
	$("#p_name").textbox("setValue", row.name);
	$("#p_orgId").textbox("setValue", row.orgId);
	$("#p_orgType").combobox('setValue', row.orgType);
	$("#p_orgName").textbox('setValue', row.orgName);
	$("#p_managerId").textbox('setValue', row.managerId);
	$("#p_managerName").textbox('setValue', row.managerName);
	$("#p_status").combobox("setValue", row.status);
	$("#p_mobile").textbox("setValue", row.mobile);
	$("#p_email").textbox("setValue", row.email);
	showModalDialog("userWindow");
	$("#btnEditOrSave").parent().css("text-align", " left");
	$('#userWindow input.easyui-validatebox').validatebox();

	//$("#tg").parent().find("input:checkbox").attr("disabled", true);
	//$("#grid2").parent().find("input:checkbox").attr("disabled", true);
	$('#tabPanel').tabs('select', 0);
}


function poiExport() {
    $("<iframe id='poiExport' style='display:none' src='../user/poiExport'>") .appendTo("body");
}

function showExamHistory() {
	showModalDialog("examHistory");
}

//---------------
function loadMyTask() {
	var options = $("#grid1").datagrid("options");
	options.url = '../common/query?mapper=hcrwMapper&queryName=queryForAuditor';
	$('#grid1').datagrid('load',{
		nd: $('#f_nd').numberspinner("getValue"),
		hcjhId: $('#f_hcjhId').textbox("getValue"),
		jhmc: $('#f_jhmc').textbox("getValue")
	});
}

function grid1ClickHandler() {
	//控制四个按钮显示
	var hcrw =  $('#grid1').datagrid('getSelected');
	$('#p_id').textbox("setValue",  hcrw.hcjhId);
	$('#p_jhmc').textbox("setValue",  hcrw.jhmc);
	$('#p_jhxdrq').datebox("setValue",  formatDate(hcrw.jhxdrq));
	$('#p_jhyqwcsj').datebox("setValue",  formatDate(hcrw.jhyqwcsj));
	$('#p_hcjieguo').combobox("setValue",  hcrw.hcjieguo);

	$('#btnSendHcgzs').linkbutton("enable");
	$('#btnSendZllxtzs').linkbutton("enable");
	$('#btnSendQyzshch').linkbutton("enable");
	$('#btnPullData').linkbutton("enable");
	$('#btnViewDocument').linkbutton("enable");
	
	//加载右侧grid
	$.ajax({
		url: "../common/query?mapper=hcsxjgMapper&queryName=queryForTask",
		data:{hcrwId:hcrw.id},
		type: 'GET',
		success: function (response) {
			if (response.status == SUCCESS) {
				if(response.rows.length == 0) {
					$.messager.confirm('确认', '核查列表尚未生成,是否认生成核查列表?', function (r) {
						if (r) {
							$.ajax({
								url: "./" + hcrw.id + "/init",
								type: 'POST',
								success: function (response) {
									if (response.status == SUCCESS) {
										refreshMainGrid()
									} else {
										//$.messager.alert('删除失败', response, 'info');
									}
								}
							});
						}
					});
				} else {
					refreshMainGrid();
				}
				
			}
		}
	});
	
	/*
	*/
}

function refreshMainGrid() {
	var options = $("#mainGrid").datagrid("options");
	options.url = '../common/query?mapper=hcsxjgMapper&queryName=queryForTask';
	$('#mainGrid').datagrid('load',{
		hcrwId:$('#grid1').datagrid('getSelected').id
	});
}

function funcBtnAudit() {
	var auditItem = $("#mainGrid").datagrid("getSelected");
	if(auditItem.page == null) {
		$.messager.alert("未配置比对页面")
	} else {
		showModalDialog("auditWindow");
		$("#auditContent").panel({
		    href:'../audit/' + auditItem.page + '.jsp',
		    onLoad:function(){
		    	doInit();
		    }
		});
		if($("#auditLog").length == 0) {
			$('<div id="auditLog" style="margin-top:5px;"></div>').appendTo($("#auditWindow"))
		}
		$("#auditLog").panel({
			href:'../audit/log.jsp',
			onLoad:function(){
				//doInit();
			}
		});
	}
}

function closeAuditWindow() {
	$("#auditWindow").window("close");
}

function stylerHczt(val,row,index) {
	if(val == 1) {
		return "";
	} else if (val == 2) {
		return "background-color:yellow";
	} else if (val == 3) {
		return "background-color:lightgreen";
	}
}

function stylerHcjg(val,row,index) {
	
	if(val == 1) {
		return "background-color:lightgreen";
	} else if(val == 2) {
		return "background-color:pink";
	} else {
		return "";
	}
}

function funcBtnRest() {
	$("#f_nd").textbox("setValue", new Date().getFullYear());
	$("#f_hcjhId").textbox("setValue", "");
	$("#f_jhmc").textbox("setValue", "");
}

function clearInput() {
	$("#f_hcjhId").textbox("setValue", "");
	$("#f_jhmc").textbox("setValue", "");
	$("#p_id").textbox("setValue", "");
	$("#p_jhmc").textbox("setValue", "");
	$("#p_xdsj").datebox("setValue", "");
	$("#p_yqwcsj").datebox("setValue", "");
}

function funcBtnPullData() {
	var row = $("#grid1").datagrid("getSelected");
	$.getJSON("./" + row.id + "/pull" , null, function (response) {
        if (response.status == SUCCESS) {
        	$.messager.alert("提示", "数据加载成功" + response.message, 'info');
        	refreshMainGrid();
        }
    });
}

function funcBtnViewDocument() {
	if(!$(this).linkbutton('options').disabled) {
		showModalDialog("documentWindow");
		$("#docPanel").panel({
		    href:'./docList.jsp',
		    onLoad:function(){
		    	doInit();
		    }
		});
	}
}

$(function() {
	clearInput();
	$("#f_nd").textbox("setValue", new Date().getFullYear());
	$("#btnView").click(showExamHistory);
	loadMyTask();
	$("#btnAudit").click(funcBtnAudit);
	
	$("#btnSearch").click(loadMyTask);
	$("#btnReset").click(funcBtnRest);
	$("#btnPullData").click(funcBtnPullData);
	$("#btnViewDocument").click(funcBtnViewDocument);
});