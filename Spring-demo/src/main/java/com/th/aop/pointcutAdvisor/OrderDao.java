package com.th.aop.pointcutAdvisor;

/**
 * @ClassName: OrderDao
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/6 11:06
 * @Version 1.0
 */
public class OrderDao {

	public void add() {
		System.out.println("正在执行 UserDao 的 add() 方法……");
	}
	public void adds() {
		System.out.println("正在执行 UserDao 的 adds() 方法……");
	}
	public void delete() {
		System.out.println("正在执行 UserDao 的 delete() 方法……");
	}
	public void modify() {
		System.out.println("正在执行 UserDao 的 modify() 方法……");
	}
	public void get() {
		System.out.println("正在执行 UserDao 的 get() 方法……");
	}
}