package com.example.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.model.Customer;

public class CustomerRowMapper implements RowMapper<Customer>{

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Customer(
	            rs.getString("id"),
	            rs.getString("name"),
	            rs.getString("email"),
	            rs.getString("address"),
	            rs.getString("region"),
	            rs.getDate("created_at"),
	            rs.getDate("modified_at")
	        );
	}

}
