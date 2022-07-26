package com.th.annotransation;

import java.math.BigDecimal;

/**
 * @ClassName: Account
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/11 9:53
 * @Version 1.0
 */
public class Account {
	private  Long id;

	private  String  userId;

    /**
     * 已用账户金额
	 */
	private BigDecimal total;

	/**
	 * 剩余账户金额
	 */
	private  BigDecimal residue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public BigDecimal getResidue() {
		return residue;
	}

	public void setResidue(BigDecimal residue) {
		this.residue = residue;
	}

	@Override
	public String toString() {
		return "Account{" +
				"id=" + id +
				", userId='" + userId + '\'' +
				", total=" + total +
				", residue=" + residue +
				'}';
	}
}