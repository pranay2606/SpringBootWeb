package com.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.EmpModel;
import com.web.service.EmpService;

@RestController
public class EmpRestController {
	
	@Autowired
	private EmpService service;
	
	@GetMapping("viewEmps")
	public List<EmpModel> viewEmpAll() {
		return service.viewAll();
	}
	
	
	@PostMapping("addEmp")
	public void addEmp1(@RequestBody EmpModel model) {
		service.addEmp(model);
	}
	
	@GetMapping("viewEmp/{no}")
	public Optional<EmpModel> viewSelectEmp(@PathVariable("no") int empno){
		return service.viewEmp(empno);
		
	}
	
//	@PutMapping("updateEmp")
//	public void updateEmp(@RequestBody EmpModel model) {
//		service.updateEmp(model);
//	}
	
	@GetMapping("viewEmpJob/{job}/{deptno}")
	public List<EmpModel> viewEmpData(@PathVariable String job,@PathVariable int deptno) {
		return service.getData(job,deptno);
	}
	
	@GetMapping("viewSal/{sal}")
	public List<EmpModel> viewEmpData(@PathVariable int sal) {
		return service.getSal(sal);
	}
	
	@PutMapping("updateEmp")
	public void updateEmp(@RequestBody EmpModel model) {
		service.updateEmp(model);
	}
	@DeleteMapping("deleteEmp/{empno}")
	public void deleteEmp(@PathVariable int empno) {
		service.deleteEmp(empno);
	}
}







