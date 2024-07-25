package com.web.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.web.model.EmpModel;

@Repository
public class EmpRepo {
	List<EmpModel> empList = new ArrayList<EmpModel>();
	
	public EmpRepo() {
		empList.add(new EmpModel(101, "abcd", 10000, 10, "Sales"));
		empList.add(new EmpModel(102, "bcde", 20000, 30, "IT"));
		empList.add(new EmpModel(103, "cdef", 30000, 20, "Manager"));
	}
	
	public void addEmpData(EmpModel empM) {
		empList.add(empM);
	}
	
	public List<EmpModel> getAllEmps() {
		return empList;
	}
}
