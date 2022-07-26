package com.th.inherit;

/**
 * @ClassName: Dog
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/5 9:49
 * @Version 1.0
 */
public class Dog {

	private  String name;
	private  Integer age;
	private  String call;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setCall(String call) {
		this.call = call;
	}

	@Override
	public String toString() {
		return "Dog{" +
				"name='" + name + '\'' +
				", age=" + age +
				", call='" + call + '\'' +
				'}';
	}
}