package com.th.bean;

import java.util.Date;

/**
 * @ClassName: User
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/8/8 14:14
 * @Version 1.0
 */
public class User {
	private String userName;
	private Date birth;
	private Double height;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "User{" +
				"userName='" + userName + '\'' +
				", birth=" + birth +
				", height=" + height +
				'}';
	}
}