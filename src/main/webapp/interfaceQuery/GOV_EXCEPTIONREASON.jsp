<%@ page contentType="text/html; charset=UTF-8"%>
    <script>
        //表配置，需要给出表名和显示的列表
        var tableConfig = {tableName:"GOV_EXCEPTIONREASON",columns:[[
            {field:"PRIPID",title:"企业内部序号",width:100},
            {field:"LRSY",title:"列入事由（代码）",width:100},
            {field:"LRRQ",title:"列入日期",width:100,formatter:formatDate},
            {field:"JDJG",title:"决定机关",width:100}
        ]]};
        /**
         * 查询语句中WHERE条件设置，需要设置成性数组，数据中存放对象huskyCommonQueryWhere
         * huskyCommonQueryWhere:
         *   columnName:字段名
         *   data:字段对应的查询值
         *   columnType:字段类型 STRING DATE NUBER
         */
        var huskyCommonQueryWheres=new Array();

        function search(){
            huskyCommonQueryWheres= new Array();
            if($("#PRIPID").val()!="" && $("#PRIPID").val()!=null) {
                var huskyCommonQueryWhere = {};
                huskyCommonQueryWhere.columnName = "PRIPID";
                huskyCommonQueryWhere.data = $("#PRIPID").val();
                huskyCommonQueryWhere.columnType = "STRING";
                huskyCommonQueryWheres.push(huskyCommonQueryWhere);
            }

            doInitGrid();
        }
        function reset(){
            $("#panel").panel('refresh','GOV_EXCEPTIONREASON.jsp');
        }
        $(function() {
             $("#btnSearch").click(search);
             $("#btnReset").click(reset);
        });
    </script>
<div id="panel" class="easyui-panel" title="" >
    <%--查询条件--%>
    <div style="padding: 5px 10px 0px 10px">
        <p style="margin-top: 0px; margin-bottom: 5px;">
            企业内部序号:<input id="PRIPID" style="margin-left:5px;margin-right:8px" value=""/>
            <span style="width:300px;">
			<a href="javascript:void(0);" id="btnSearch" class="easyui-linkbutton" plain="true" iconCls="icon-search">查找</a>
			<a href="javascript:void(0);" id="btnReset" class="easyui-linkbutton" plain="true" iconCls="icon2 r3_c10">重置</a>
			</span>
        </p>
    </div>

    <table id="dg" class="easyui-datagrid" >  </table>
</div>
