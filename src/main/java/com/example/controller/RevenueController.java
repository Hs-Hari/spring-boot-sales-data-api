package com.example.controller;

import com.example.service.RevenueService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/revenue")
public class RevenueController {
	
	@Autowired
    RevenueService revenueService;

	@GetMapping("/total")
    public ResponseEntity<BigDecimal> getTotalRevenue(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {

        BigDecimal totalRevenue = revenueService.getTotalRevenue(startDate, endDate);
        return ResponseEntity.ok(totalRevenue != null ? totalRevenue : BigDecimal.ZERO);
    }

    // Total Revenue by Product
    @GetMapping("/by-product")
    public ResponseEntity<List<Map<String, Object>>> getTotalRevenueByProduct(
    		@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {
        List<Map<String, Object>> revenueData = revenueService.getTotalRevenueByProduct(startDate, endDate);
        return ResponseEntity.ok(revenueData);
    }

    // Total Revenue by Category
    @GetMapping("/by-category")
    public ResponseEntity<List<Map<String, Object>>> getTotalRevenueByCategory(
    		@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {
        List<Map<String, Object>> revenueData = revenueService.getTotalRevenueByCategory(startDate, endDate);
        return ResponseEntity.ok(revenueData);
    }

    // Total Revenue by Region
    @GetMapping("/by-region")
    public ResponseEntity<List<Map<String, Object>>> getTotalRevenueByRegion(
    		@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {
        List<Map<String, Object>> revenueData = revenueService.getTotalRevenueByRegion(startDate, endDate);
        return ResponseEntity.ok(revenueData);
    }
}
