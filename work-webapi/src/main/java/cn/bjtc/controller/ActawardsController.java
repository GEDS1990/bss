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
import cn.bjtc.service.IActawardsService;
import cn.bjtc.view.ActawardsView;

@RestController
@RequestMapping("actawd")
public class ActawardsController extends BaseController{
	
	@RequestMapping(value="all", method=RequestMethod.POST)
	public ApiReturn showActawards(){
		ApiParam param=ApiManager.getInstance().getParameters(request);
		ActawardsView view=(ActawardsView) ParamUtil.convertToView(param, ActawardsView.class);
		int count=actawardsService.countAllActawards(view);
		List<?> actawards=actawardsService.findAllActawards(view);
		apiReturn.setCount(count);
		apiReturn.setData(actawards);
		return apiReturn;
	}
	
	@RequestMapping(value="create", method=RequestMethod.POST)
	public ApiReturn execAddActawards(){
		ApiParam param=ApiManager.getInstance().getParameters(request);
		ActawardsView view=(ActawardsView) ParamUtil.convertToView(param, ActawardsView.class);
		actawardsService.saveActawards(view);
		return apiReturn;
	}
	
	@RequestMapping(value="update", method=RequestMethod.POST)
    public ApiReturn execUpdateActawards(){
		ApiParam param=ApiManager.getInstance().getParameters(request);
		ActawardsView view=(ActawardsView) ParamUtil.convertToView(param, ActawardsView.class);
		actawardsService.updateActawards(view);
		return apiReturn;
	} 
    
	@RequestMapping(value="get", method=RequestMethod.POST)
    public ApiReturn execeditActawards(){
		ApiParam param=ApiManager.getInstance().getParameters(request);
		ActawardsView view=(ActawardsView) ParamUtil.convertToView(param, ActawardsView.class);
		List<?> actawards=actawardsService.findAllActawards(view);
		apiReturn.setData(actawards);
		return apiReturn;	
	}
    
	@Autowired
	private IActawardsService actawardsService;
}
