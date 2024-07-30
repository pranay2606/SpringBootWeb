package com.web.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class EmpModel {
	@Id
	private int empno;
	private String ename;
	private int sal;
	private int deptno;
	private String job;
	
	
	
	public EmpModel() {
		super();
	}
	public EmpModel(int empno, String ename, int sal, int deptno, String job) {
		
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.deptno = deptno;
		this.job = job;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "EmpModel [empno=" + empno + ", ename=" + ename + ", sal=" + sal + ", deptno=" + deptno + ", job=" + job
				+ "]";
	}
	
	
}
