<%@ page contentType="text/html; charset=UTF-8"%>
<div id="roleWindow" style="padding: 5px;">
	<%-- <jsp:include page="iterationBar.jsp"/> --%> 
	<div id="tabPanel" class="easyui-tabs" style="width:725px;clear:both;" data-options="onSelect:tabSelectHandler">
		<div title="基本信息" style="padding:5px;" selected="true">
			<table width="100%" id="roleTable">
				<tr>
					<td style="text-align: right;">角色代码</td>
					<td >
						<input type="hidden" id="p_id"/>
						<input class="easyui-validatebox add" id="p_role" type="text"
								data-options="required:true" style="width:200px;"/>
					</td>
				</tr>
				<tr>
					<td style="text-align: right;">角色名称</td>
					<td><input class="easyui-validatebox add update" type="text" id="p_name" data-options="required:true" style="width:200px;"/>
					</td>
				</tr>
				<tr>
					<td style="text-align: right;">描述</td>
					<td colspan='5'>
						<input id="p_description" class="easyui-validatebox add update" style="width:200px;" data-options="required:false" />
					</td>
				</tr>
				<tr>
					<td style="text-align: right;">状态</td>
					<td><input id="p_status" class="easyui-combobox add update" style="width:200px;" data-options="required:true,panelHeight:100" codeName="userStatus"/></td>
				</tr>

			</table>
		</div>
		<div title="角色功能授权" style="padding:5px;">
			<div>
				<!-- <a href="#" id="btnEditOrSaveRoleResource" class="easyui-linkbutton" iconCls="icon-save" plain="true">保存</a> -->
				<a href="#" id="btnExpandAll" class="easyui-linkbutton" iconCls="icon-plus" plain="true">展开</a>
				<a href="#" id="btnCollapseAll" class="easyui-linkbutton" iconCls="icon-minus" plain="true">缩回</a>
				<%--<a href="#" id="btnAddRoleResource" class="easyui-linkbutton" iconCls="icon-add" plain="true">增加</a>--%>
				<%--<a href="#" id="btnDeleteRoleResource" class="easyui-linkbutton" iconCls="icon-remove" plain="true">删除</a>--%>
			</div>
			<div id="treePanel"></div>
		</div>
		<div title="对应操作人员" style="" id="roleUserForm">	</div>
	</div>
</div>

<script>

function expandAll(e) {
	_expandAll("expandAll");
}

function collapseAll() {
	_expandAll("collapseAll");
}

function _expandAll(type) {
	var zTree = $.fn.zTree.getZTreeObj("resTree"),
	nodes = zTree.getSelectedNodes();
	if (type.indexOf("All")<0 && nodes.length == 0) {
		alert("请先选择一个父节点");
	}
	if (type == "expandAll") {
		expandNodes(zTree, zTree.getNodes());
		checkAuthorizedResourceNode();
	} else if (type == "collapseAll") {
		zTree.expandAll(false);
	}
}

function expandNodes(zTree, nodes) {
	if (!nodes) return;
	for (var i=0, l=nodes.length; i<l; i++) {
		zTree.expandNode(nodes[i], true, false, false, true);
		if (nodes[i].isParent && nodes[i].zAsync) {
			expandNodes(zTree,  nodes[i].children);
		}
	}
}
</script>	