package com.th.icsetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: ImainApp
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/1 15:09
 * @Version 1.0
 */
public class ImainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/ICBeans.xml");
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee.toString());
	}
}