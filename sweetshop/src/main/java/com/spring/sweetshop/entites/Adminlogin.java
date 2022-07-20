package com.spring.sweetshop.entites;

public class Adminlogin {
	private String adminID;
	private String password;
	
	//default constructor
	public Adminlogin() {
		super();
	}
	//parameterised constructor
	public Adminlogin(String adminID, String password) {
		super();
		this.adminID = adminID;
		this.password = password;
	}
	
	//getter-setter method
	public String getAdminID() {
		return adminID;
	}
	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//for displaying
	@Override
	public String toString() {
		return "Adminlogin [adminID=" + adminID + ", password=" + password + "]";
	}
	
	

}
