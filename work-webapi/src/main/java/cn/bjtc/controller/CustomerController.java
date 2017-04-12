package cn.bjtc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.bjtc.api.ApiManager;
import cn.bjtc.api.ApiParam;
import cn.bjtc.api.ApiReturn;
import cn.bjtc.api.util.ParamUtil;
import cn.bjtc.service.ICustomerService;
import cn.bjtc.view.CustomerView;

@RestController
@RequestMapping("cust")
public class CustomerController extends BaseController{
	
	@RequestMapping(value="all",method=RequestMethod.POST)
	public ApiReturn showCustomers(){
		ApiParam param=ApiManager.getInstance().getParameters(request);
		CustomerView view=(CustomerView) ParamUtil.convertToView(param, CustomerView.class);
		int count =customerService.countAllCusts(view);
		List<?> custs=customerService.findAllCusts(view);
		apiReturn.setCount(count);
		apiReturn.setData(custs);
		return  apiReturn;
	}
	
	@RequestMapping(value="get",method=RequestMethod.POST)	
	public ApiReturn execeditCustomer(){
		ApiParam param=ApiManager.getInstance().getParameters(request);
		CustomerView view=(CustomerView) ParamUtil.convertToView(param, CustomerView.class);
		List<?> custs=customerService.findAllCusts(view);
		apiReturn.setData(custs);
		return  apiReturn;

	}
	
	
	@Autowired
	private ICustomerService  customerService;

}
