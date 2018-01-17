package com.yun.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {
	
	@GetMapping("/item")
	public String item(Model model){
		model.addAttribute("itemArr", 	
				new String[]{"iphone7手机","华为手机","小米手机"});
		return "item";
	}
	
}
