window.firstFlag=1;//是否页面初始化标志，用于某些方法在初始化时不能调用标志
window.hcsxJgRenewFlag=0;//是否需要重新生成核查事项结果数据标志 0不需要 1需要

function taskStatusStyler(val, row, index) {
    if (val == 1) {
        return "background-color:lightgray";
    } else if (val == 2) {
        return "background-color:orange";
    } else if (val == 3) {
        return "background-color:pink";
    } else if (val == 4) {
        return "background-color:red";
    } else if (val == 5) {
        return "background-color:lightgreen";
    }
}

function tabSelectHandler(title, index) {
    if (index == 0) {
        if(window.firstFlag==0){
            minimizeMyTaskWindow();
        }
        loadWGSTask();
    }else{
        window.firstFlag=0;
        showTaskListWindow()
    }
}
//我的核查任务表格点击事件
function myTaskGridClickHandler() {
    //控制四个按钮显示
    var hcrw = $('#myTaskGrid').datagrid('getSelected');
    $('#p_hcdwXydm').val(hcrw.hcdwXydm);
    $('#p_hcdwName').val(hcrw.hcdwName);
    $('#p_hcjieguo').combobox("setValue", hcrw.hcjieguo);

    $('#btnSendHcgzs').linkbutton("enable");
    $('#btnSendZllxtzs').linkbutton("enable");
    $('#btnSendQyzshch').linkbutton("enable");
    $('#btnOpenEtlTool').linkbutton("enable");
    $('#btnViewDocument').linkbutton("enable");
    $('#btnPrintHeChaJieGuo').linkbutton("enable");
    $('#btnPrintGongShiXinXiGengZheng').linkbutton("enable");

    $('#btnPullData').linkbutton("enable");
    window.hcsxJgRenewFlag=0;
    refreshAuditItemList();
}
//显示指定任务的核查事项列表
function refreshAuditItemList() {
    if ($("#annualAuditItemGrid").length == 0 && $("#instanceAuditItemGrid").length == 0) {
        $("#auditItemList").panel({
            fit:true,
            href: './auditItemLista_js.jsp',
            onLoad: function () {
                doAuditItemListInit();
            }
        });
    } else {
        doAuditItemListInit();
    }
}
//加载核查任务
function loadMyTask() {
    var options = $("#myTaskGrid").datagrid("options");
    options.url = "../common/query?mapper=jsHcrwMapper&queryName=query&zfryCode="+userInfo.userId;

    $("#myTaskGrid").datagrid("load",  {
        hcdwXydm: $('#f_hcdwXydm').val(),
        hcdwName: $('#f_hcdwName').val()
    });
}
//取得即时信息未公示的任务
function loadWGSTask() {
    var options = $("#gridWGS").datagrid("options");
    options.url = "../common/query?mapper=jsHcrwMapper&queryName=query";
    $("#gridWGS").datagrid("load",  {
        jsGsFlag: 0,
        hcdwXydm:$('#f_hcdwXydm').val(),
        hcjgmc:$('#f_hcjgmc').val()
    });
}
//隐藏核查任务窗口
function minimizeMyTaskWindow() {
    $("#myTaskListWindow").window("minimize");
}
//打开核查任务窗口
function showTaskListWindow() {
    $("#myTaskListWindow").window({
        title: "我的任务列表", top: 5, left: $.util.windowSize().width-755, width: 750, height: 450,
        modal:false,
        collapsible:true,
        closable:false,
        minimizable:true,
        border:false,
        autoVCenter: false,     //该属性如果设置为 true，则使窗口保持纵向居中，默认为 true。
        autoHCenter: false,      //该属性如果设置为 true，则使窗口保持横向居中，默认为 true。
        onOpen : function() {
            loadMyTask();
        }
    });
}
//认领按钮点击事件
function renLing(){
    var data=$("#gridWGS").datagrid("getSelected");
    if(null==data){
        $.messager.show("操作提醒", "请选择数据！", "info", "bottomRight");
    }else{

        $.post("./js/renLing",{"id":data.id,"zt":1},function(response){
            $.messager.show("操作提醒", response.message, "info", "bottomRight");
            if(response.status==$.husky.SUCCESS){
                loadWGSTask();
            }
        });
    }
}
//取消认领按钮点击事件
function unRenLing(){
    var data=$("#gridWGS").datagrid("getSelected");
    if(null==data){
        $.messager.show("操作提醒", "请选择数据！", "info", "bottomRight");
    }else{

        $.post("./js/renLing",{"id":data.id,"zt":0},function(response){
            $.messager.show("操作提醒", response.message, "info", "bottomRight");
            if(response.status==$.husky.SUCCESS){
                loadWGSTask();
            }
        });
    }
}
//加载在线数据按钮点击事件
function pullData() {
    window.hcsxJgRenewFlag=1;
    refreshAuditItemList();
}

//未公示任务查找
function searchWGS(){
    loadWGSTask();
}
//未公示任务重置
function resetWGS(){
    $('#f_hcdwXydm').val("");
    $('#f_hcjgmc').val("");
    loadWGSTask();
}
//初始化
$(function () {
    $.husky.getUserInfo();
});