package com.th.aop.autoproxy;

import com.th.aop.UserDao;
import com.th.aop.pointcutAdvisor.OrderDao;
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
		//获取 ApplicationContext 容器
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/autoproxyBeans.xml");
		//获取代理对象
		UserDao userDao = context.getBean("userDao", UserDao.class);
		//获取代理对象
		OrderDao orderDao = context.getBean("orderDao", OrderDao.class);
		//调用 UserDao 中的各个方法
		userDao.add();
		userDao.delete();
		userDao.modify();
		userDao.get();
		//调用 OrderDao 中的各个方法
		orderDao.add();
		orderDao.adds();
		orderDao.delete();
		orderDao.get();
		orderDao.modify();
	}
}