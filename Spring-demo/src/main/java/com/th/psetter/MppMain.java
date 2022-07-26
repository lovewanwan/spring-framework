package com.th.psetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: MppMain
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/1 14:29
 * @Version 1.0
 */
public class MppMain {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("spring/PBeans.xml");
		Employee employee = context.getBean("employee",Employee.class);
		System.out.println(employee.toString());
	}
}