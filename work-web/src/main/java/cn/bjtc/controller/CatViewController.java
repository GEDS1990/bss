package cn.bjtc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.bjtc.annotation.SysPrivilege;

@Controller
@RequestMapping("cat")
public class CatViewController {

	@RequestMapping(value="show.html",method=RequestMethod.GET)
	@SysPrivilege(name="cat:show")
	public String showCatView(){
		return "cat/list";	
	}
	

	@RequestMapping(value="add.html",method=RequestMethod.GET)
	@SysPrivilege(name="cat:add")
    public String showCatAddView(){
		return "cat/add";
	}
	
	@RequestMapping(value="{id}.html",method=RequestMethod.GET)
	@SysPrivilege(name="cat:edit")
	public String showCatEditView(@PathVariable Integer id,Model model){
		model.addAttribute("id", id);
		return "cat/edit";
		
	}
	
}
