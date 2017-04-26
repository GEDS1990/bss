package cn.bjtc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.bjtc.annotation.SysPrivilege;

@Controller 
@RequestMapping("menu")
public class MenuViewController {
	
	@RequestMapping(value="show.html",method=RequestMethod.GET)
	@SysPrivilege(name="menu:show")
	public String showMenuView(){
		return "menu/list";
	}
	
	@RequestMapping(value="add.html",method=RequestMethod.GET)
	@SysPrivilege(name="menu:add")
	public String showMenuAddView(){
		return "menu/add";
	}
	
	@RequestMapping(value="{menuid}.html",method=RequestMethod.GET)
	@SysPrivilege(name="menu:add")
	public String showMenuEditView(@PathVariable Integer menuid,Model model){
		model.addAttribute("menuid", menuid);
		return "menu/edit";
	}

}
