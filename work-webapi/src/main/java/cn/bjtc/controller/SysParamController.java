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
import cn.bjtc.load.StartupLoader;
import cn.bjtc.service.ISysParamService;
import cn.bjtc.view.SysParamView;

@RestController
@RequestMapping("sysparam")
public class SysParamController extends BaseController {

	@RequestMapping(value="all", method=RequestMethod.POST)
	public ApiReturn showSysParams(){
		ApiParam param = ApiManager.getInstance().getParameters(request);
		SysParamView view = (SysParamView) ParamUtil.convertToView(param, SysParamView.class);
		int count = sysParamService.countAllSysParams(view);
		List<?> privis = sysParamService.findAllSysParams(view);
		apiReturn.setCount(count);
		apiReturn.setData(privis);
		return apiReturn;
	}
	
	@RequestMapping(value="create", method=RequestMethod.POST)
	public ApiReturn execAddSysParam(){
		ApiParam param = ApiManager.getInstance().getParameters(request);
		SysParamView view = (SysParamView) ParamUtil.convertToView(param, SysParamView.class);
		sysParamService.saveSysParam(view);
		return apiReturn;
	}
	
	@RequestMapping(value="update", method=RequestMethod.POST)
	public ApiReturn execUpdateSysParam(){
		ApiParam param = ApiManager.getInstance().getParameters(request);
		List<Object> views = ParamUtil.convertToViewList(param, SysParamView.class);
		for(Object obj : views){
			SysParamView view = (SysParamView) obj;
			sysParamService.updateSysParam(view);
		}
		return apiReturn;
	}
	
	@RequestMapping(value="refresh", method=RequestMethod.POST)
	public ApiReturn refreshApiMap(){
		try {
			startupLoader.initSysParam();
		} catch (Exception e) {
			apiReturn.setCode(1);
			apiReturn.setMessage("刷新过程中出现异常！");
		}
		return apiReturn;
	}
	
	@Autowired
	private ISysParamService sysParamService;
	@Autowired
	private StartupLoader startupLoader;
}
