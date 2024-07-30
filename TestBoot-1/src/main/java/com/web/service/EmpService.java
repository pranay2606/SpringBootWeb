package com.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.EmpModel;
import com.web.repo.EmpRepo;
import com.web.repo.EmpRepoJPA;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepoJPA repo;
	//private EmpRepo repo;
	
	public void addEmp(EmpModel emp) {
		repo.save(emp);
	}

	public List<EmpModel> viewAll() {
		return repo.findAll();
	}

	public Optional<EmpModel> viewEmp(int empno) {
		
		return repo.findById(empno);
	}

	public List<EmpModel> getData(String keyword,int deptno) {
		return repo.findByJobAndDeptno(keyword,deptno);
		
	}
	
	public List<EmpModel> getSal(int sal){
		return repo.findBySalGreaterThan(sal);
	}

	public void updateEmp(EmpModel model) {
		repo.save(model);
	}

	public void deleteEmp(int empno) {
		repo.deleteById(empno);
	}
	
}
