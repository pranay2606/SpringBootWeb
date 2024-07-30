package com.web.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.web.model.EmpModel;


public class EmpRepo {
	List<EmpModel> empList = new ArrayList<EmpModel>();
	
	public EmpRepo() {
		empList.add(new EmpModel(101, "abcd", 10000, 10, "Sales"));
		empList.add(new EmpModel(102, "bcde", 20000, 30, "IT"));
		empList.add(new EmpModel(103, "cdef", 30000, 20, "Manager"));
	}
	
	
	private JdbcTemplate jdbc;
	
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}
	@Autowired
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	public void addEmpData(EmpModel empM) {
		String sql = "insert into emp values(?,?,?,?,?)";
		
		jdbc.update(sql,empM.getEmpno(),empM.getEname(),empM.getSal(),empM.getDeptno(),empM.getJob());
	}
	
	public List<EmpModel> getAllEmps() {
		return empList;
	} 

	public EmpModel viewEmp(int empno) {
		
		for(EmpModel model:empList) {
			if(model.getEmpno()==empno) {
				return model;
			}
		}
		return null;
	}

	public void updateEmp(EmpModel model) {
		for(EmpModel emp: empList) {
			if(emp.getEmpno()==model.getEmpno()) {
				emp.setEname(model.getEname());
				emp.setSal(model.getSal());
				emp.setDeptno(model.getDeptno());;
				emp.setJob(model.getJob());;
			}
		}
		
	}
}
