package com.example.model;

import java.util.Date;

public class Sales {
	
	private String id = "";
	
	private String orderId = "";
	
	private String productId = "";
	
	private int quantitySold = 0;
	
	private float unitPrice = 0;
	
	private float discount = 0;
	
	private float shippingCost = 0;
    
    private Date createdAt;
    
    private Date modifiedAt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getQuantitySold() {
		return quantitySold;
	}

	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public float getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(float shippingCost) {
		this.shippingCost = shippingCost;
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

	public Sales(String id, String orderId, String productId, int quantitySold, float unitPrice, float discount,
			float shippingCost, Date createdAt, Date modifiedAt) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.productId = productId;
		this.quantitySold = quantitySold;
		this.unitPrice = unitPrice;
		this.discount = discount;
		this.shippingCost = shippingCost;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
	}

	@Override
	public String toString() {
		return "Sales [id=" + id + ", orderId=" + orderId + ", productId=" + productId + ", quantitySold="
				+ quantitySold + ", unitPrice=" + unitPrice + ", discount=" + discount + ", shippingCost="
				+ shippingCost + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + "]";
	}
	 	
}
