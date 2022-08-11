package com.th.entity;

import java.math.BigDecimal;

/**
 * @ClassName: Product
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/8/4 14:53
 * @Version 1.0
 */
public class Product {
	private  Integer productId;

	private  String productName;
	private BigDecimal price;
	private Integer storage;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer producetId) {
		this.productId = producetId;
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

	public Integer getStorage() {
		return storage;
	}

	public void setStorage(Integer storage) {
		this.storage = storage;
	}

	@Override
	public String toString() {
		return "Product{" +
				"producetId=" + productId +
				", productName='" + productName + '\'' +
				", price=" + price +
				", storage=" + storage +
				'}';
	}
}