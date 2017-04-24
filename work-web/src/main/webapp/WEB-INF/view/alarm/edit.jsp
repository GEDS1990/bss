<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<form id="frm_alarm" method="post">
	<table cellpadding="5">
		<tr>
			<td>预警分类：</td>
			<td>
				<input id="cbx_alarmtype" class="easyui-combobox" type="text" name="factcatid" data-options="required:true"></input>
				<input class="easyui-textbox" type="hidden" name="alarmid" data-options="required:true"></input>
			</td>
		</tr>
		<tr>
			<td>预警对象：</td>
			<td><input class="easyui-combobox" type="text" name="objid" data-options="required:true"></input></td>
		</tr>
		<tr>
			<td>因子：</td>
			<td><input id="cbx_factor" class="easyui-combobox" type="text" name="factorid" data-options="required:true"></input></td>
		</tr>
		<tr>
			<td>因子值：</td>
			<td><input class="easyui-textbox" type="text" name="factvalueid" data-options="required:true"></input></td>
		</tr>
		<tr>
			<td>因子值单位：</td>
			<td><input id="cbx_factunit" class="easyui-combobox" type="text" name="factunit" data-options="required:true"></input></td>
		</tr>
		<tr>
			<td>状态：</td>
			<td><input id="cbx_alarmst" class="easyui-combobox" type="text" name="alarmst" data-options="required:true"></input></td>
		</tr>
	</table>
</form>
<script>
var alarmTypeCombox = new BSS.Combox('#cbx_alarmtype');
alarmTypeCombox.fromDict('DICT_ALARMTYPE',function(){
	var factunitCombox = new BSS.Combox('#cbx_factunit');
	factunitCombox.fromDict('DICT_FACTUNIT',function(){
		var alarmStCombox = new BSS.Combox('#cbx_alarmst');
		alarmStCombox.fromDict('DICT_ALARMST',function(){
			ALARMDIALOG.loadFactor('#cbx_factor',function(){
				initAlarmEditPage();
			});
		});
	});
});

function initAlarmEditPage(){
	BSS.dispatch({code:15006,data:[{alarmid:'${alarmid}'}]},function(resp){
		if(resp.code == 0){
			BSS.json2form('#frm_alarm',resp.data[0]);
			
			ALARMDIALOG.ok = function(){
				var alarm = BSS.form2json('#frm_alarm');
				BSS.dispatch({code:15005,data:[alarm]},function(){
					BSS.alert('保存成功！');
				},function(){});
			};
		}else{
			ALARMDIALOG.ok = function(){};
			BSS.warning(resp.message);
		}
	});
}
</script>