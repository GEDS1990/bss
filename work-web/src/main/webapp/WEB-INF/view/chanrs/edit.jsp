<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<form id="frm_chanrs" method="post">
	<table cellpadding="5">
		<tr>
			<td>渠道名称：</td>
			<td>
				<input id="id_objid" class="easyui-textbox" type="text" name="objid" data-options="required:true"></input>
				<input id="id_staffobjid" class="easyui-textbox" type="hidden" name="staffobjid"></input>
			</td>
		</tr>
		<tr>
			<td>员工名称：</td>
			<td><input id="cbx_chan_staff" class="easyui-combobox" type="text" name="staffid" data-options="required:true"></input></td>
		</tr>
		<tr>
			<td>关系类型：</td>
			<td><input id="id_cstype" class="easyui-textbox" type="text" name="cstype" data-options="required:true"></input></td>
		</tr>
		<tr>
			<td>对象类型：</td>
			<td><input id="cbx_objtype" class="easyui-combobox" type="text" name="objtype" data-options="required:true"></input></td>
		</tr>
		<tr>
			<td>创建时间：</td>
			<td><input id="id_createtime" class="easyui-textbox" type="text" name="createtime" data-options="required:true"></input></td>
		</tr>
	</table>
</form>
<script>
var objTypeCombox = new BSS.Combox('#cbx_objtype');
objTypeCombox.fromDict('DICT_OBJTYPE',function(){
	CHANRSDIALOG.loadStaff('#cbx_chan_staff',function(){
		initChanrsEditPage();
	});
});

function initChanrsEditPage(){
	BSS.dispatch({code:13015,data:[{staffobjid:'${staffobjid}'}]},function(resp){
		if(resp.code == 0){
			BSS.json2form('#frm_chanrs',resp.data[0]);
			CHANRSDIALOG.ok = function(){
				var chanrs = BSS.form2json('#frm_chanrs');
				BSS.dispatch({code:13005,data:[chanrs]},function(){
					BSS.alert('保存成功！');
				},function(){});
			}
		}else{
			BSS.warning(resp.message);
		}
	});
	
}
</script>