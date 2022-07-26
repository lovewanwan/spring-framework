package com.th.scope.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: MainApp
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/4 11:02
 * @Version 1.0
 */
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/PrototypeBeans.xml");

		PrototypeBean prototypeBean = context.getBean("prototypeBean",PrototypeBean.class);
		PrototypeBean prototypeBean1 = context.getBean("prototypeBean",PrototypeBean.class);

		System.out.println("prototypeBean :"+prototypeBean);
		System.out.println("prototypeBean1:"+prototypeBean1);

		System.out.println("执行完成");
	}
}