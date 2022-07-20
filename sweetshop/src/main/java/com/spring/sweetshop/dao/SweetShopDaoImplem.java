package com.spring.sweetshop.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.sweetshop.entites.Adminlogin;

public   class SweetShopDaoImplem implements SweetShopDao{

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public Adminlogin adminlogin(String adminID, String password) {
	String query="select *from adminlogin where adminID=? and password=?";
			RowMapper<Adminlogin> rowMapper = new RowMapperImpl();
			Adminlogin adminlogin=this.jdbcTemplate.queryForObject(query, rowMapper,adminID,password);
			return adminlogin;
		
	}
	

	

}
