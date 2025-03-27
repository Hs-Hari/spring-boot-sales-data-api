package com.example.model;

import java.util.Date;

public class Customer {
	
	private String id = "";
	
    private String name = "";
    
    private String email = "";
    
    private String address = "";
    
    private String region = "";
    
    private Date createdAt = null;;
    
    private Date modifiedAt = null;;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
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
		
	public Customer(String id, String name, String email, String address, String region, Date createdAt,
			Date modifiedAt) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.region = region;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", region="
				+ region + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt + "]";
	}
  	
}
