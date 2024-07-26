package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.EmpModel;
import com.web.repo.EmpRepo;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepo repo;
	
	public void addEmp(EmpModel emp) {
		repo.addEmpData(emp);
	}
	
	public List<EmpModel> viewAll() {
		return repo.getAllEmps();
	}

	public EmpModel viewEmp(int empno) {
		return repo.viewEmp(empno);
		
	}

	public void updateEmp(EmpModel model) {
		repo.updateEmp(model);
		
	}
}
