<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<table id="tbl_motscheme_datagrid" class="easyui-datagrid"></table>
<div id="div_motschemeadd" style="padding:0 0 0 50px;"></div>
<!-- javascript部分 -->
<script language="javascript" src="js/easyui/jquery.easyui.min.js" charset="utf-8"></script>
<script language="javascript" src="js/easyui/locale/easyui-lang-zh_CN.js" charset="utf-8"></script>
<script>
$(function(){
	var options={
		columns:[[
          {field:'id',title: 'ID',align: 'center',hidden:'true'},
          {field:'schmname',title: '方案名称',align: 'center',width: 550},
          {field:'schmdesc',title: '方案描述',align: 'center',width: 550 },
		]]
	};
	//构建datagrid，并填充数据
	var dataGrid = new BSS.DataGrid('#tbl_motscheme_datagrid');
	SCHEMEDIALOG = new BSS.Dialog('#div_motschemeadd');
	dataGrid.build(options,{code:22004});
	//设置新建事件
	dataGrid.create = function(){
		SCHEMEDIALOG.init({href:'scheme/add.html',width:400});
	};
	//设置编辑事件
	dataGrid.edit = function(){
		var row=this.getSelectedRow();
		if(BSS.Helper.isNull(row)){
			BSS.warning('请选择要编辑的数据行');
			return;
		}
		var id = row['id'];
		SCHEMEDIALOG.init({href:'scheme/'+id+'.html',width:400});
	};
})
</script>