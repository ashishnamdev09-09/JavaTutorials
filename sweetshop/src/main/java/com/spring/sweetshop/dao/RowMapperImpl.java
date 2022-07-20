package com.spring.sweetshop.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.sweetshop.entites.Adminlogin;

public class RowMapperImpl implements RowMapper<Adminlogin> {

	@Override
	public Adminlogin mapRow(ResultSet rs, int rowNum) throws SQLException {
		Adminlogin adminlogin=new Adminlogin();
		adminlogin.setAdminID(rs.getString(1));
		adminlogin.setPassword(rs.getString(2));
		return adminlogin;
	}

}
