<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<form id="frm_prm" method="post">
	<table cellpadding="5">
		<tr>
			<td>参数名称：</td>
			<td><input id="id_paramname" class="easyui-textbox" type="text" name="paramname" data-options="required:true"></input></td>
			<input id="id_id" class="easyui-textbox" type="hidden" name="id"></input>
		</tr>
		<tr>
			<td>参数描述：</td>
			<td><input id="id_paramdesc" class="easyui-textbox" type="text" name="paramdesc" data-options="required:false"></input></td>
		</tr>
		<tr>
			<td>参数类型：</td>
			<td><input id="cbx_paramtype" class="easyui-textbox" type="text" name="paramtype" data-options="required:true"></input></td>
		</tr>
		<tr>
			<td>规格状态：</td>
			<td><input id="cbx_paramst" class="easyui-textbox" type="text" name="paramst" data-options="required:true"></input></td>
		</tr>
	</table>
</form>
<script>
var typeCombox = new BSS.Combox('#cbx_paramtype');
typeCombox.fromDict('DICT_PARAMTYPE',function(){
	var parCombox = new BSS.Combox('#cbx_paramst');
	parCombox.fromDict('DICT_PARAMST',function(){
		initParametersEditPage();
	});
});
function initParametersEditPage(){
	BSS.dispatch({code:14019,data:[{id:'${id}'}]},function(resp){
		if(resp.code == 0){
			BSS.json2form('#frm_prm',resp.data[0]);
			
			PARMDIALOG.ok = function(){
				var prm = BSS.form2json('#frm_prm');
				BSS.dispatch({code:14008,data:[prm]},function(){
					BSS.alert('保存成功！');
				},function(){});
			};
		}else{
			PARMDIALOG.ok = function(){};
			BSS.warning(resp.message);
		}
	});
}
</script>