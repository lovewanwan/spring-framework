package com.th.aop.pointcutAdvisor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @ClassName: OrderDaoAroundAdvice
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/6 11:06
 * @Version 1.0
 */
public class OrderDaoAroundAdvice implements MethodInterceptor {


	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("环绕增强前*************");
		//执行被代理对象中的逻辑
		Object result = methodInvocation.proceed();
		System.out.println("环绕增强后**********");
		return  result;
	}
}