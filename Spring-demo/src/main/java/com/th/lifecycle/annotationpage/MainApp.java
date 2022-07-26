package com.th.lifecycle.annotationpage;

import com.th.lifecycle.xmlpage.XmlLifeCycleBean;
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
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("spring/annotationBean.xml");
		AnnotationLifeCycleBean annotationLifeCycleBean = context.getBean("annotationLiftCycleBean",AnnotationLifeCycleBean.class);
		System.out.println(annotationLifeCycleBean);

		//手动销毁Bean
		context.close();
	}

}