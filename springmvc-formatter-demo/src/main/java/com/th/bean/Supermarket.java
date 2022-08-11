package com.th.bean;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName: Supermarket
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/8/9 16:42
 * @Version 1.0
 */
public class Supermarket {

	private  String name;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;

	@NumberFormat(style = NumberFormat.Style.CURRENCY)
	private BigDecimal money;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Supermarket{" +
				"name='" + name + '\'' +
				", date=" + date +
				", money=" + money +
				'}';
	}
}