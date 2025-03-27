--------------

This is a backend API built with Java Spring Boot, using JDBC and SQL Server for data 
storage. The API provides endpoints to retrieve revenue data based on different criteria.

Ensure you have the following installed:
	Java 17 or later,
	Maven (for building the project),
	SQL Server (for database storage),
	Postman (for API testing)
	
git clone https://github.com/Hs-Hari/spring-boot-sales-data-api.git
cd spring-boot-sales-data-api

spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=sales_db;encrypt=true;trustServerCertificate=true;
spring.datasource.username=sa
spring.datasource.password=sqlserver@123

spring.datasource.driver-class-name=com.microsoft.sqlserver.jdbc.SQLServerDriver
spring.jpa.database-platform=org.hibernate.dialect.SQLServerDialect

--------------

1. Get Total Revenue
Endpoint:
	GET /api/revenue/total
Description:
	Returns the total revenue within a specified date range.
Request 
	api/revenue/total?startDate=2024-01-01&endDate=2024-01-31
Response (200 OK):
	{
	  "total_revenue": 150000.75
	}
	
2. Get Total Revenue by Product
Endpoint:
  GET /api/revenue/by-product

Description:
  Returns total revenue grouped by product within a specified date range.

Request:
  api/revenue/by-product?startDate=2024-01-01&endDate=2024-01-31

Response (200 OK):
	[
	  {
	    "product_name": "Laptop",
	    "total_revenue": 50000.00
	  },
	  {
	    "product_name": "Smartphone",
	    "total_revenue": 75000.50
	  }
	]
	
3. Get Total Revenue by Category
Endpoint:
  GET /api/revenue/by-category

Description:
  Returns total revenue grouped by category within a specified date range.

Request:
  api/revenue/by-category?startDate=2024-01-01&endDate=2024-01-31

Response (200 OK):
	[
	  {
	    "category": "Electronics",
	    "total_revenue": 120000.75
	  },
	  {
	    "category": "Furniture",
	    "total_revenue": 30000.00
	  }
	]
	
4. Get Total Revenue by Region
Endpoint:
  GET /api/revenue/by-region

Description:
  Returns total revenue grouped by region within a specified date range.

Request:
  api/revenue/by-region?startDate=2024-01-01&endDate=2024-01-31

Response (200 OK):
	[
	  {
	    "region": "North America",
	    "total_revenue": 80000.00
	  },
	  {
	    "region": "Europe",
	    "total_revenue": 70000.75
	  }
	]