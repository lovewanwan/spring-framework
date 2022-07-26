package com.th.inherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: MainApp
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/5 9:53
 * @Version 1.0
 */
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("spring/inheritBeans.xml");
		Dog dog = context.getBean("dog",Dog.class);
		System.out.println(dog);
	}
}