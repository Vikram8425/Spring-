package com.example.demo.Model;

public class Product {
	private  int    productId;
	private String productName;
	private String productDesc;
	private double productPrize;
	private boolean stock;
	public Product(int productId, String productName, String productDesc, double productPrize, boolean stock) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.productPrize = productPrize;
		this.stock = stock;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public double getProductPrize() {
		return productPrize;
	}
	public void setProductPrize(double productPrize) {
		this.productPrize = productPrize;
	}
	public boolean isStock() {
		return stock;
	}
	public void setStock(boolean stock) {
		this.stock = stock;
	}
	
	public Product() {
		
	}

}
