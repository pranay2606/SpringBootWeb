package com.web;

import org.springframework.stereotype.Component;

@Component
public class TestModel {
	private String user;
	private String email;
	private String phno;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "TestModel [user=" + user + ", email=" + email + ", phno=" + phno + "]";
	}
	
	
}
