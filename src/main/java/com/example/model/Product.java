package com.example.model;

import java.util.Date;

public class Product {
	
	private String id = "";
	
    private String productName = "";
    
    private String category = "";
    
    private Date createdAt = null;
    
    private Date modifiedAt = null;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public Product(String id, String productName, String category, Date createdAt, Date modifiedAt) {
		super();
		this.id = id;
		this.productName = productName;
		this.category = category;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", category=" + category + ", createdAt="
				+ createdAt + ", modifiedAt=" + modifiedAt + "]";
	}
    	
}
