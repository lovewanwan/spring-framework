package com.th.annoautowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: MainAPp
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/5 16:17
 * @Version 1.0
 */
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/annoautowireBeans.xml");
		UserController controller = context.getBean("userController",UserController.class);
		controller.doStr();
	}
}