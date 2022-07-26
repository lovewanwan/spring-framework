package com.th.aop.xmlaspectJ;

/**
 * @ClassName: OrderDaoImpl
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/6 16:46
 * @Version 1.0
 */
public class OrderDaoImpl implements  OrderDao{
	@Override
	public void add() {
		System.out.println("正在执行 OrderDao 中的 add() 方法");
	}

	@Override
	public void delete() {
		System.out.println("正在执行 OrderDao 中的 delete() 方法");
	}

	@Override
	public Integer modify() {
		System.out.println("正在执行 OrderDao 中的 modify() 方法");
		return 1;
	}

	@Override
	public void get() {
		//异常
		int a = 10 / 0;
		System.out.println("正在执行 OrderDao 中的 get() 方法");
	}
}