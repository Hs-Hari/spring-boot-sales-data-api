package com.example.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface RevenueService {

    BigDecimal getTotalRevenue(Date startDate, Date endDate);

    List<Map<String, Object>> getTotalRevenueByProduct(Date startDate, Date endDate);

    List<Map<String, Object>> getTotalRevenueByCategory(Date startDate, Date endDate);

    List<Map<String, Object>> getTotalRevenueByRegion(Date startDate, Date endDate);
}
