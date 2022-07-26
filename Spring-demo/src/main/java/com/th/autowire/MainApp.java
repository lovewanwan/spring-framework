package com.th.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: MainApp
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/5 13:54
 * @Version 1.0
 */
public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/autowireBeans.xml");
		Employee employee = context.getBean("employee",Employee.class);
		System.out.println(employee);


	}

}