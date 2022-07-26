package com.th;

import com.th.constructor.Student;
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
		HelloWorld obj =context.getBean("helloWorld",HelloWorld.class);
		obj.getMessage();


		// 采用BeanFactory 实现IOC
		/*BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring/Beans.xml");
		HelloWorld beanObj = beanFactory.getBean("helloWorld",HelloWorld.class);
		beanObj.getMessage();*/

		//ApplicationContext context = new ClassPathXmlApplicationContext("spring/Beans.xml");
		Student student =context.getBean("student",Student.class);
		System.out.println(student.toString());
	}
}