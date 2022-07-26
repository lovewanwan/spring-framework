package com.th.scope.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: MainApp
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/4 10:28
 * @Version 1.0
 */
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/singletonBeans.xml");
		SingletonBean singletonBean= context.getBean("singleonBean",SingletonBean.class);
		SingletonBean singletonBean1 = context.getBean("singleonBean",SingletonBean.class);

		System.out.println("singletonBean :"+singletonBean);
		System.out.println("singletonBean1:"+singletonBean1);
	}
}