package com.cts.ecart.dto;

public class ProductDTO {

	private int productId;
	private String productTitle;
	private int productQty;
	private double productPrice;
	private String productDesc;
	private String productImage;
	private String productKeywords;
	private int catId;
	private int brandId;
	
	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

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

	

	

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	@Override
	public String toString() {
		return "ProductDTO [productId=" + productId + ", productTitle=" + productTitle + ", productQty=" + productQty
				+ ", productPrice=" + productPrice + ", productDesc=" + productDesc + ", productImage=" + productImage
				+ ", productKeywords=" + productKeywords + ", catId=" + catId + ", brandId=" + brandId
				+ "]";
	}

}
