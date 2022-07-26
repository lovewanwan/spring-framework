package com.th.setter;

import com.th.setter.Student;
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
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/SetterBeans.xml");
		Student student =context.getBean("student", Student.class);
		System.out.println(student.toString());
	}
}