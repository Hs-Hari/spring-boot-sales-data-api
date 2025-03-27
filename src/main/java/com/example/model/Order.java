package com.example.model;

import java.util.Date;

public class Order {
	
	private String id = "";
	
    private String customerId = "";
    
    private Date dateOfSale = null;
    
    private String paymentMethod = "";
    
    private Date createdAt = null;
    
    private Date modifiedAt = null;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Date getDateOfSale() {
		return dateOfSale;
	}

	public void setDateOfSale(Date dateOfSale) {
		this.dateOfSale = dateOfSale;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
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

	public Order(String id, String customerId, Date dateOfSale, String paymentMethod, Date createdAt, Date modifiedAt) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.dateOfSale = dateOfSale;
		this.paymentMethod = paymentMethod;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", customerId=" + customerId + ", dateOfSale=" + dateOfSale + ", paymentMethod="
				+ paymentMethod + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + "]";
	}	
  	
}
