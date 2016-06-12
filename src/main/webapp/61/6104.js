function queryPlan(node) {
    var _orgId = $("#f_deptName").combobox("getValue");
    if (_orgId != "") {
        var orgId = new Array();
        orgId.push(_orgId);
        xxxx(orgId);
    } else if (window.orgTreeObj) {
        queryPlanFromTree();
    }
}
function grid1ClickHandler() {
    if ($('#grid1').datagrid('getSelected') != null) {
        $('#btnModify').linkbutton('enable');
        $('#btnAudit').linkbutton('enable');
        $('#btnViewCheckList').linkbutton('enable');
        if ($('#grid1').datagrid('getSelected').shzt != 2) {
            $('#btnModify').linkbutton('enable');
            $('#btnAudit').linkbutton({
                text: '审核',
                iconCls: 'icon2 r14_c2'
            });
        } else {
            $('#btnModify').linkbutton('disable');
            $('#btnAudit').linkbutton({
                text: '取消审核',
                iconCls: 'icon2 r14_c1'
            });
        }
    } else {
        $('#btnModify').linkbutton('disable');
        $('#btnAudit').linkbutton('disable');
        $('#btnViewCheckList').linkbutton('disable');
    }
    $('#grid2').datagrid("loadData", {total: 0, rows: []})
}

function grid2ClickHandler() {
    if ($('#grid1').datagrid('getSelected') != null) {
        $('#btnShowDetail').linkbutton('enable');
    } else {
        $('#btnShowDetail').linkbutton('disable');
    }
}
function formatZfry(val, row) {
    return row.zfryName1 + "/" + row.zfryName2;
}

function loadGrid1() {
    var options = $("#grid1").datagrid("options");
    options.url = '../common/query?mapper=hcjhMapper&queryName=query';
    $('#grid1').datagrid('load', {
        nd: $('#f_nd').numberspinner("getValue"),
        jhbh: $('#f_jhbh').textbox("getValue"),
        gsjhbh: $('#f_gsjhbh').textbox("getValue"),
        jhmc: $('#f_jhmc').textbox("getValue"),
        nr: $('#f_nr').combobox("getValue"),
        fl: $('#f_fl').combobox("getValue")
    });
}

function clearInput() {
    $("#f_id").val("");
    $("#f_jhbh").textbox("setValue", "");
    $("#f_gsjhbh").textbox("setValue", "");
    $("#f_jhmc").textbox("setValue", "");
    $("#f_nr").combobox("setValue", "");
    $("#f_fl").combobox("setValue", "");
}

function funcBtnRest() {
    $("#f_nd").textbox("setValue", new Date().getFullYear());
    clearInput();
}
function onTreeClick(event, treeId, treeNode, clickFlag) {
    var treeObj = $.fn.zTree.getZTreeObj("orgTree");
    var selected = treeObj.getSelectedNodes()
    var hcjh = $('#grid1').datagrid('getSelected');
    if (selected.length == 1 && hcjh != null) {

        var options = $("#grid2").datagrid("options");
        options.url = '../common/query?mapper=hcrwMapper&queryName=queryForOrg';
        $('#grid2').datagrid('load', {
            hcjhId: hcjh.id,
            organization: selected[0].id,
            order: 1
        });
    } else {

    }
}

//初始化
$(function () {
    $.fn.zTree.init($("#orgTree"), setting);

    $("#f_nd").textbox("setValue", new Date().getFullYear());
    clearInput();
    loadGrid1();
    $("#btnSearch").click(loadGrid1);
    $("#btnReset").click(funcBtnRest);

    $("#btnPrint").click(function () {
        var data = null;
        var treeObj = $.fn.zTree.getZTreeObj("orgTree");
        var selected = treeObj.getSelectedNodes();
        var hcjh = $('#grid1').datagrid('getSelected');
        var params = {
            "pageTitle": selected[0].name + "工商行政管理局\n抽查结果公示表\n（文号）",
            "pageTitleFirst": "1",
            "pageFoot": selected[0].name + "工商行政管理局公章\n        年    月    日",
            "pageFootLast": "1",
            "titleHeight": 40,
            "pageRows": 24,
            "firstPageRows": 15,
            "pageWidth": 297, "pageHeight": 210,
            "pageName": "", "pageOrient": 1
        };
        var columnList = [];
        columnList.push({"fieldName": "hcdwName", "header": "企业名称", "colWidth": 80});
        columnList.push({"fieldName": "hcdwXydm", "header": "注册号", "colWidth": 80});
        columnList.push({"fieldName": "hcjgmc", "header": "检查机关", "colWidth": 80});
        columnList.push({"fieldName": "sjwcrq", "header": "检查时间", "colWidth": 20});
        columnList.push({"fieldName": "hcjieguo", "header": "抽查结果", "colWidth": 30, "codeName": "hcjg"});
        //取得数据
        $.getJSON("../common/query?mapper=hcrwMapper&queryName=queryForOrg&hcjhId=" + hcjh.id + "&organization=" + selected[0].id + "&order=1", null, function (response) {
            if (response.status == 1) {
                data = response.rows;
                listPrint(params, data, columnList);
            }
        });
    });
});
