package cn.bjtc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {

	@RequestMapping(value="cstmchk/show.html",method=RequestMethod.GET)
	public String showCstmChkView(){
		return "cmchk/show";
	}
}
