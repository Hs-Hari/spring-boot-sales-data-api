package com.example.service.impl;

import com.example.service.RevenueService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class RevenueServiceImpl implements RevenueService {

    private final JdbcTemplate jdbcTemplate;

    public RevenueServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public BigDecimal getTotalRevenue(Date startDate, Date endDate) {
        String sql = "SELECT SUM((s.quantity_sold * s.unit_price) - s.discount - s.shipping_cost) AS total_revenue " 
                   + "FROM tb_sales s " 
                   + "INNER JOIN tb_order o ON s.order_id = o.id " 
                   + "WHERE o.date_of_sale BETWEEN ? AND ?";

        return jdbcTemplate.queryForObject(sql, new Object[]{startDate, endDate}, BigDecimal.class);
    }

    @Override
    public List<Map<String, Object>> getTotalRevenueByProduct(Date startDate, Date endDate) {
        String sql = "select p.product_name, " 
        				+ "sum((s.quantity_sold * s.unit_price) - s.discount - s.shipping_cost) as total_revenue " 
        				+ "from tb_sales s " 
        				+ "inner join tb_order o on s.order_id = o.id " 
        				+ "inner join tb_product p on s.product_id = p.id " 
        				+ "where o.date_of_sale between ? and ? " 
        				+ "group by p.product_name";
        return jdbcTemplate.queryForList(sql, startDate, endDate);
    }

    @Override
    public List<Map<String, Object>> getTotalRevenueByCategory(Date startDate, Date endDate) {
        String sql = "select p.category, " 
        				+ "sum((s.quantity_sold * s.unit_price) - s.discount - s.shipping_cost) as total_revenue " 
        				+ "from tb_sales s " 
        				+ "inner join tb_order o on s.order_id = o.id " 
        				+ "inner join tb_product p on s.product_id = p.id " 
        				+ "where o.date_of_sale between ? and ? " 
        				+ "group by p.category";
        return jdbcTemplate.queryForList(sql, startDate, endDate);
    }

    @Override
    public List<Map<String, Object>> getTotalRevenueByRegion(Date startDate, Date endDate) {
        String sql = "select c.region, " 
        				+ "sum((s.quantity_sold * s.unit_price) - s.discount - s.shipping_cost) as total_revenue " 
        				+ "from tb_sales s " 
        				+ "inner join tb_order o on s.order_id = o.id " 
        				+ "inner join tb_customer c on o.customer_id = c.id " 
        				+ "where o.date_of_sale between ? and ? " 
        				+ "group by c.region";
        return jdbcTemplate.queryForList(sql, startDate, endDate);
    }
}
