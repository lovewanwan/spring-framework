package com.th.inherit;

/**
 * @ClassName: Animal
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/5 9:48
 * @Version 1.0
 */
public class Animal {

	private  String name;

	private  Integer age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}