package com.th.aop.annoaspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: MainApp
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/7 15:43
 * @Version 1.0
 */
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		UserDao userDao=(UserDao)context.getBean("userDao");
		userDao.add();
		userDao.delete();
		userDao.modify();
		userDao.get();
	}
}