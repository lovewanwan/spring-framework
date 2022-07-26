package com.th.csetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: mainApp
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/1 14:57
 * @Version 1.0
 */
public class mainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/CBeans.xml");
		Employee employee = context.getBean("employee",Employee.class);
		System.out.println(employee.toString());
	}
}