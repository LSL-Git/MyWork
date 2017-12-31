package com.demo7;

public class Product {

	private String prod_id;
	private String pname;
	private double price;
	private int stock;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	public Product(String prodId, String pname, double price, int stock) {
		super();
		prod_id = prodId;
		this.pname = pname;
		this.price = price;
		this.stock = stock;
	}

	public String getProd_id() {
		return prod_id;
	}
	public void setProd_id(String prodId) {
		prod_id = prodId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}
