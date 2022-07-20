package com.spring.sweetshop.dao;

import com.spring.sweetshop.entites.Adminlogin;

public interface SweetShopDao {
	
	public Adminlogin adminlogin(String adminID,String password);

}
