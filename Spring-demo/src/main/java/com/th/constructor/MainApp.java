package com.th.constructor;

import com.th.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: MainApp
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/6/30 13:48
 * @Version 1.0
 */
public class MainApp {
	public static void main(String[] args) {

		//使用ApplicationContext实现IOC
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/Beans.xml");
		Student student =context.getBean("student",Student.class);
		System.out.println(student.toString());
	}
}