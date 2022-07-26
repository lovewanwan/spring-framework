package com.th.lifecycle.interfacepage;

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
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("spring/interfaceBeans.xml");
		LifeCycleBean lifeCycleBean = context.getBean("liftCycleBean",LifeCycleBean.class);
		System.out.println(lifeCycleBean);

		//手动销毁Bean
		context.close();
	}

}