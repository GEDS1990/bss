<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
			<div id="div_customer_tab" class="easyui-tabs">
				<div title="会员">
					<table id="customer_memb" class="easyui-datagrid"></table>
				</div>
				<div title="商户">
					<table id="customer_bus" class="easyui-datagrid"></table>
				</div>
			</div>
	<div id="div_customer_center" data-options="region:'center'" style="width:auto">
		<div id="div_customer_center_pnl"></div>
	</div>
 
  
<!-- javascript部分 -->
 <script>
$(function(){
	var options1={
		columns:[[
          {field:'cstmid',title: 'ID',align: 'center',hidden:'true'},
          {field:'cstmname',title: '会员名称',align: 'center',width: 200},
          {field:'certno',title: '证件号码',align: 'center',width: 200},
          {field:'certtype',title: '证件类型值',align: 'center',hidden:'true'},
          {field:'certtypeStr',title: '证件类型',align: 'center',width: 200},
          {field:'mobile',title: '手机',align: 'center',width: 200},
          {field:'gender',title: '性别值',align: 'center',hidden:'true'},
          {field:'genderStr',title: '性别',align: 'center',width: 200},
          {field:'birthday',title: '出生日期',align: 'center',width: 200},
          {field:'cstmlevel',title: '客户等级',align: 'center',width: 200},
          {field:'cstmphoto',title: '客户头像',align: 'center',width: 200},
          {field:'hobby',title: '爱好',align: 'center',width: 200},
          {field:'email',title: '电子邮件',align: 'center',width: 200},
          {field:'cstmtype',title: '客户类型值',align: 'center',hidden:'true'},
          {field:'cstmtypeStr',title: '客户类型',align: 'center',width: 200},
          {field:'regtime',title: '注册日期',align: 'center',width: 200},
          {field:'cstmst',title: '状态',align: 'center',hidden:'true'},
          {field:'cstmstStr',title: '状态',align: 'center',width: 200}
		]]
	};
	//构建会员datagrid，并填充数据
	var custmembGrid = new BSS.DataGrid('#customer_memb');
	custmembGrid.toolbar=null;
	custmembGrid.build(options1,{code:12002,data:[{cstmtype:1}]});
	//table
 
	var options2={
			columns:[[
	          {field:'cstmid',title: 'ID',align: 'center',hidden:'true'},
	          {field:'cstmname',title: '商户名称',align: 'center',width: 200},
	          {field:'certno',title: '证件号码',align: 'center',width: 200},
	          {field:'certtype',title: '证件类型值',align: 'center',hidden:'true'},
	          {field:'certtypeStr',title: '证件类型',align: 'center',width: 200},
	          {field:'mobile',title: '手机',align: 'center',width: 200},
	          {field:'cstmlevel',title: '客户等级',align: 'center',width: 200},
	          {field:'cstmphoto',title: '客户头像',align: 'center',width: 200},
	          {field:'hobby',title: '爱好',align: 'center',width: 200},
	          {field:'email',title: '电子邮件',align: 'center',width: 200},
	          {field:'cstmtype',title: '客户类型值',align: 'center',hidden:'true'},
	          {field:'cstmtypeStr',title: '客户类型',align: 'center',width: 200},
	          {field:'regtime',title: '注册日期',align: 'center',width: 200},
	          {field:'cstmst',title: '状态',align: 'center',hidden:'true'},
	          {field:'cstmstStr',title: '状态',align: 'center',width: 200}
			]]
		};
	//构建商户datagrid，并填充数据
	var custbusGrid = new BSS.DataGrid('#customer_bus');
	custbusGrid.toolbar=null;
	custbusGrid.build(options2,{code:12002,data:[{cstmtype:2}]});
	 
})
</script>