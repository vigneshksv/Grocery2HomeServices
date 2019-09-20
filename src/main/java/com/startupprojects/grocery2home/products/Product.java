package com.startupprojects.grocery2home.products;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	private int productid;
	private String name;
	private String brand;
	private String category;
	private String description;
	private double price;
	
	public Product() {

	}
	
	public Product(int productid, String name, String brand, String category, String description, double price) {
		super();
		this.productid = productid;
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.description = description;
		this.price = price;
	}
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
