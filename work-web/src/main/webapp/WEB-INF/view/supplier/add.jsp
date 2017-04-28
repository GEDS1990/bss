<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<form id="frm_supp" method="post">
	<table cellpadding="5">
		<tr>
			<td>供应商名称：</td>
			<td>
				<input class="easyui-textbox" type="text" name="suppname" data-options="required:true"></input>
			</td>
		</tr>
		<tr>
			<td>供应商级别：</td>
			<td><input id="cbx_supplv" class="easyui-textbox" type="text" name="supplv" data-options="required:false"></input></td>
		</tr>
		<tr>
			<td>联系人：</td>
			<td><input class="easyui-textbox" type="text" name="contact" data-options="required:true"></input></td>
		</tr>
		<tr>
			<td>手机：</td>
			<td><input class="easyui-textbox" type="text" name="mobile" data-options="required:true"></input></td>
		</tr>
		<tr>
			<td>电话：</td>
			<td><input class="easyui-textbox" type="text" name="telephone" data-options="required:false"></input></td>
		</tr>
		<tr>
			<td>联系地址：</td>
			<td><input class="easyui-textbox" type="text" name="address" data-options="required:true"></input></td>
		</tr>
		<tr>
			<td>是否开店：</td>
			<td><input id="cbx_isopenshop" class="easyui-textbox" type="text" name="isopenshop" data-options="required:true"></input></td>
		</tr>
	</table>
</form>
<script>
var supCombox = new BSS.Combox('#cbx_supplv');
supCombox.fromDict('DICT_SUPPLV',function(){
	var isCombox = new BSS.Combox('#cbx_isopenshop');
	isCombox.fromDict('DICT_ISOPENSHOP',function(){
		setOk();
	});
});

function setOk(){
	SUPPLIERDIALOG.ok = function(){
		var supp = BSS.form2json('#frm_supp');
		BSS.dispatch({code:13001,data:[supp]},function(){
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