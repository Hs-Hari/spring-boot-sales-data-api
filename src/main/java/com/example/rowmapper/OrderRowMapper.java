package com.example.rowmapper;

import com.example.model.Order;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderRowMapper implements RowMapper<Order> {
    @Override
    public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Order(
            rs.getString("id"),
            rs.getString("customer_id"),
            rs.getDate("date_of_sale"),
            rs.getString("payment_method"),
            rs.getDate("created_at"),
            rs.getDate("modified_at")
        );
    }
}
