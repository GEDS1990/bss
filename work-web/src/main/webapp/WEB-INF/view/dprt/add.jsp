<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<form id="frm_deport" method="post">
	<table cellpadding="5">
		<tr>
			<td>部门名称：</td>
			<td>
				<input class="easyui-textbox" type="text" name="departname" data-options="required:true"></input>
			</td>
		</tr>
		<tr>
			<td>负责人：</td>
			<td><input class="easyui-textbox" type="text" name="leader" data-options="required:false"></input></td>
		</tr>
		<tr>
			<td>上级部门：</td>
			<td><input class="easyui-textbox" type="text" name="parentid" data-options="required:false"></input></td>
		</tr>
		<tr>
			<td>地址：</td>
			<td><input class="easyui-textbox" type="text" name="address" data-options="required:false"></input></td>
		</tr>
		<tr>
			<td>联系电话：</td>
			<td><input class="easyui-textbox" type="text" name="telephone" data-options="required:false"></input></td>
		</tr>
		<tr>
			<td>部门状态：</td>
			<td><input id="cbx_departst" class="easyui-textbox" type="text" name="departst" data-options="required:true"></input></td>
		</tr>
	</table>
</form>
<script>
var genderCombox = new BSS.Combox('#cbx_departst');
genderCombox.fromDict('DICT_DEPARTST',function(){
	setOk();
});

function setOk(){

	DEPTDIALOG.ok = function(){
		var deport = BSS.form2json('#frm_deport');
		BSS.dispatch({code:11006,data:[deport]},function(resp){
			if(resp.code == 0){
				BSS.info('保存成功');
			}else{
				BSS.warning(resp.message);
			}
		},function(resp){
			console.log(JSON.stringify(resp));
		});
	}
}
</script>