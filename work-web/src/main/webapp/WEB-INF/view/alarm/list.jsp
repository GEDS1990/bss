<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<table id="tbl_alarm_datagrid" class="easyui-datagrid"></table>
<div id="div_alarmadd" style="padding:0 0 0 50px;"></div>
<!-- javascript部分 -->
<script>
$(function(){
	var options={
		columns:[[
          {field:'alarmid',title: 'ID',align: 'center',hidden:'true'},
          {field:'factcatid',title: '预警分类',align: 'center',hidden:'true'},
          {field:'factcatidStr',title: '预警分类',align: 'center',width: 150},
          {field:'objid',title: '预警对象',align: 'center',width: 150},
          {field:'factorid',title: '因子ID',align: 'center',hidden:'true'},
          {field:'factoridStr',title: '因子',align: 'center',width: 200},
          {field:'factvalueid',title: '因子值',align: 'center',width: 150},
          {field:'factunit',title: '单位ID',align: 'center',hidden:'true'},
          {field:'factunitStr',title: '单位',align: 'center',width: 150},
          {field:'alarmst',title: '状态值',align: 'center',hidden:'true'},
          {field:'alarmstStr',title: '状态',align: 'center',width: 150}
		]]
	};
	//构建datagrid，并填充数据
	var alarmGrid = new BSS.DataGrid('#tbl_alarm_datagrid');
	ALARMDIALOG = new BSS.Dialog('#div_alarmadd');
	ALARMDIALOG.loadFactor=function(selector,callback){
		BSS.dispatch({code:15011},function(resp){
			if(resp.code == 0){
				var datas = resp.data;
				var options = {valueField:'value',textField:'label',data:datas};
				var alarmTypeCombox = new BSS.Combox(selector);
				alarmTypeCombox.init(options);
				if(callback && jQuery.isFunction(callback)){
					callback();
				}
			}else{
				BSS.warning(resp.message);
			}
		},function(resp){})
	}
	alarmGrid.build(options,{code:15002});
	//设置新建事件
	alarmGrid.create = function(){
		ALARMDIALOG.init({href:'alarm/add.html',width:400});
	};
	//设置编辑事件
	alarmGrid.edit = function(){
		var row=this.getSelectedRow();
		if(BSS.Helper.isNull(row)){
			BSS.warning('请选择要编辑的数据行');
			return;
		}
		var alarmid = row['alarmid'];
		ALARMDIALOG.init({href:'alarm/'+alarmid+'.html',width:400});
	};
})
</script>