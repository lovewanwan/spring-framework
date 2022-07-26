package com.th.transaction;

import java.math.BigDecimal;

/**
 * @ClassName: Order
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/11 9:48
 * @Version 1.0
 */
public class Order {
	private Long id;

	private String orderId;

	private  String userId;

	private  String productId;

	/**
	 * 订单商品数量
	 */
	private  Integer count;

	/**
	 * 订单金额
	 */
	private BigDecimal money;

	/**
	 * 订单状态
	 */
	private  Integer status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order{" +
				"id=" + id +
				", orderId='" + orderId + '\'' +
				", userId='" + userId + '\'' +
				", productId='" + productId + '\'' +
				", count=" + count +
				", money=" + money +
				", status=" + status +
				'}';
	}
}