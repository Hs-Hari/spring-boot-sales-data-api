package com.example.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.model.Product;

public class ProductRowMapper implements RowMapper<Product>{

	@Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Product(
            rs.getString("id"),
            rs.getString("product_name"),
            rs.getString("category"),
            rs.getDate("created_at"),
            rs.getDate("modified_at")
        );
    }

}
