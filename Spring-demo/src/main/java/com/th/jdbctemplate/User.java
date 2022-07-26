package com.th.jdbctemplate;

/**
 * @ClassName: User
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/7 16:50
 * @Version 1.0
 */
public class User {

	private  Integer id;

	public  String userName;

	private  String  password;

	private  String bithday;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getBithday() {
		return bithday;
	}

	public void setBithday(String bithday) {
		this.bithday = bithday;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", userName='" + userName + '\'' +
				", password='" + password + '\'' +
				", bithday='" + bithday + '\'' +
				'}';
	}
}