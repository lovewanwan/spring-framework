package com.th.aop.xmlaspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: MainApp
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/6 17:01
 * @Version 1.0
 */
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("spring/xmlapsectJBeans.xml");

		OrderDao orderDao =context.getBean("orderDao",OrderDao.class);

		orderDao.add();

		orderDao.delete();

		orderDao.modify();

		orderDao.get();
	}
}