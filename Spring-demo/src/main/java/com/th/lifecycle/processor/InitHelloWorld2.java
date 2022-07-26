package com.th.lifecycle.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

/**
 * @ClassName: InitHelloWorld2
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/4 16:47
 * @Version 1.0
 */
public class InitHelloWorld2 implements BeanPostProcessor, Ordered {
	@Override
	public int getOrder() {
		return 0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("B Before : " + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("B After : " + beanName);
		return bean;
	}
}