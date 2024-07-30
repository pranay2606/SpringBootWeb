package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.service.EmpService;
import com.web.model.EmpModel;

@Controller
public class EmpController {
	
	
	@Autowired
	private EmpService service;
	
	@RequestMapping("/")
	public String home() {
		return "emp/Home";
	}
	
	@RequestMapping("addemp")
	public String addEmp() {
		return "emp/addemp";
	}
	
//	@RequestMapping("viewemp")
//	public String viewAllEmp(Model model) {
//		List<EmpModel> emps =  service.viewAll();
//		model.addAttribute("emps",emps);
//		return "emp/viewall";
//	}
	
	@RequestMapping("handleForm")
	public String handleEmpForm(@ModelAttribute("emps") EmpModel emp) {
		
		service.addEmp(emp);
		return "emp/success";
	}
	
}

