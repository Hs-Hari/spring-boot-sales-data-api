package com.example.rowmapper;

import com.example.model.Sales;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SalesRowMapper implements RowMapper<Sales> {
    @Override
    public Sales mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Sales(
    		rs.getString("id"),
            rs.getString("order_id"),
            rs.getString("product_id"),
            rs.getInt("quantity_sold"),
            rs.getBigDecimal("unit_price").floatValue(),  
            rs.getBigDecimal("discount").floatValue(),   
            rs.getBigDecimal("shipping_cost").floatValue(), // Convert to float
            rs.getDate("created_at"),
            rs.getDate("modified_at")
        );
    }
}
