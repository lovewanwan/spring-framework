package com.th.settertest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: TMainApp
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/1 15:33
 * @Version 1.0
 */
public class TMainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/TBeans.xml");
		JavaCollection javaCollection = context.getBean("javaCollection",JavaCollection.class);
		System.out.println(javaCollection.toString());
	}
}