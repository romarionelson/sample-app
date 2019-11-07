package com.simple.spring.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
	
	
	
	@RequestMapping("/")
	String index(Model model) {
		
		model.addAttribute("data", "Romario Chuela ");
		return "index";
	}

}
