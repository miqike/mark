function onTreeClick(event, treeId, treeNode, clickFlag) {

}
$(function () {
    $.fn.zTree.init($("#orgTree"), setting);

    $("#btnSearch").click(function () {
        var treeObj = $.fn.zTree.getZTreeObj("orgTree");
        var selected = treeObj.getSelectedNodes();
        if (selected.length >= 1) {
            var options = $("#grid2").datagrid("options");
            options.url = '../common/query?mapper=hcrwMapper&queryName=queryTongJiFenXi';
            $('#grid2').datagrid('load', {
                id: selected[0].id,
                nd: $("#f_nd").numberspinner("getValue"),
                hcjhId: $("#f_hcjdId").textbox("getValue"),
                ztlx: $("#f_ztlx").combobox("getValue"),
                hyfl: $("#f_hyfl").combobox("getValue")
            }).datagrid({
                rowStyler: function (index, row) {
                    if (row.level == 1) {
                        return 'background-color:#6293BB;color:#fff;';
                    }
                }
            });

        } else {
            $.messager.alert("提示", "请选择单位", 'info');
        }
    });
});