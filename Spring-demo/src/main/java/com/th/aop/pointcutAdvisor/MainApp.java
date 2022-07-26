package com.th.aop.pointcutAdvisor;

import com.th.aop.UserDao;
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
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/PointcutAdvisorBeans.xml");
		OrderDao orderDao =context.getBean("orderDaoProxy",OrderDao.class);
		orderDao.add();
		orderDao.adds();
		orderDao.delete();
		orderDao.get();
		orderDao.modify();
	}
}