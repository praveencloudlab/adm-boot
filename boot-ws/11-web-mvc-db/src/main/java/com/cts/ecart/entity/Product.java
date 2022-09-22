package com.cts.ecart.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity(name = "products")
public class Product {

	@Id
	@GeneratedValue
	private int productId;
	private String productTitle;
	private int productQty;
	private double productPrice;
	private String productDesc;
	private String productImage;
	private String productKeywords;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "productCat")
	private Category category;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "productBrand")
	private Brand brand;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public String getProductKeywords() {
		return productKeywords;
	}

	public void setProductKeywords(String productKeywords) {
		this.productKeywords = productKeywords;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productTitle=" + productTitle + ", productQty=" + productQty
				+ ", productPrice=" + productPrice + ", productDesc=" + productDesc + ", productImage=" + productImage
				+ ", productKeywords=" + productKeywords + "]";
	}
	
	

	/*
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productTitle=" + productTitle + ", productQty=" + productQty
				+ ", productPrice=" + productPrice + ", productDesc=" + productDesc + ", productImage=" + productImage
				+ ", productKeywords=" + productKeywords + ", category=" + category + ", brand=" + brand + "]";
	}

   */
}
