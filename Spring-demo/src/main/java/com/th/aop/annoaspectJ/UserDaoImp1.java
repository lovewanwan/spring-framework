package com.th.aop.annoaspectJ;

import org.springframework.stereotype.Component;

/**
 * @ClassName: UserDaoImp1
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/7 15:38
 * @Version 1.0
 */
@Component("userDao")
public class UserDaoImp1 implements  UserDao{
	@Override
	public void add() {
		System.out.println("正在执行UserDao的add()方法");
	}

	@Override
	public void delete() {
		System.out.println("正在执行UserDao的delete()方法");
	}

	@Override
	public Integer modify() {
		System.out.println("正在执行UserDao的modfiy()方法");
		return 1;
	}

	@Override
	public void get() {
		System.out.println("正在执行UserDao的get()方法");
	}
}