package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("help")
	public String help() {
		return "Help";
	}
	
	@RequestMapping("calc")
	public String calc() {
		return "add";
	}
	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1") int a,@RequestParam("num2") int b,ModelAndView mv) {
		
		int c = a+b;
		mv.addObject("out",c);
		mv.setViewName("result");
		
		return mv;
	}
	
	@RequestMapping("contact")
	public String contact() {
		return "contact";
	}
	
	@RequestMapping("display")
	public String display(@ModelAttribute("tm") TestModel tm) {
		
		return "display";
	}
	
	
}
