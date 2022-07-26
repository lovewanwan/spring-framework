package com.th.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: MainApp
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/5 17:18
 * @Version 1.0
 */
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/aopBeans.xml");
		UserDao userDao =context.getBean("userDaoProxy",UserDao.class);
		userDao.add();
		userDao.delete();
		userDao.get();
		userDao.modify();
	}
}