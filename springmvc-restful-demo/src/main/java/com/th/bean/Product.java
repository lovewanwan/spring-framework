package com.th.bean;

import java.math.BigDecimal;

/**
 * @ClassName: Product
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/8/8 14:15
 * @Version 1.0
 */
public class Product {
	private  String productId;
	private  String productName;
	private BigDecimal price;
	private  Integer stock;
	private  String introduction;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	@Override
	public String toString() {
		return "Product{" +
				"productId='" + productId + '\'' +
				", productName='" + productName + '\'' +
				", price=" + price +
				", stock=" + stock +
				", introduction='" + introduction + '\'' +
				'}';
	}
}