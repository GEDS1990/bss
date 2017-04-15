package cn.bjtc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("stock")
public class StockViewController {
	
	@RequestMapping(value="show.html",method=RequestMethod.GET)
	public String showStockView(){
		return "stock/list";
	}
}
