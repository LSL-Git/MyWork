package com.demo4;

public class Custome {
	private String custName;
	private String email;
	private String phone;
	
	public Custome() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Custome(String custName, String email, String phone) {
		super();
		this.custName = custName;
		this.email = email;
		this.phone = phone;
	}

	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
