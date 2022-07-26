package com.th.lifecycle.xmlpage;

import com.th.lifecycle.interfacepage.LifeCycleBean;
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
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("spring/xmlBeans.xml");
		XmlLifeCycleBean xmlLifeCycleBean = context.getBean("xmlLiftCycleBean",XmlLifeCycleBean.class);
		System.out.println(xmlLifeCycleBean);

		//手动销毁Bean
		context.close();
	}

}