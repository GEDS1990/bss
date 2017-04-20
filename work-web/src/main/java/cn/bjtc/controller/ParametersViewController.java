package cn.bjtc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("param")
public class ParametersViewController {

	@RequestMapping(value="show.html",method=RequestMethod.GET)
	public String showParametersView(){
		return "parameters/list";
	}
	
	@RequestMapping(value="add.html",method=RequestMethod.GET)
	public String showParametersAddView(){
		return "parameters/add";
	}
	
	@RequestMapping(value="{id}.html",method=RequestMethod.GET)
	public String showParametersfEditView(@PathVariable Integer id,Model model){
		model.addAttribute("id", id);
		return "parameters/edit";
	}
}
