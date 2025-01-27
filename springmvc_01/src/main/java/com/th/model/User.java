package com.th.model;

/**
 * @ClassName: User
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/8/2 15:44
 * @Version 1.0
 */
public class User {

	private  String userId;
	private  String userName;
	private  String password;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User{" +
				"userId='" + userId + '\'' +
				", userName='" + userName + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}