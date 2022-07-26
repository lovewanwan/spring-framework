package com.th.lifecycle.processor;

import com.th.lifecycle.interfacepage.LifeCycleBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: MainApp
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/4 14:37
 * @Version 1.0
 */
public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring/processorBeans.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		context.registerShutdownHook();
	}

}