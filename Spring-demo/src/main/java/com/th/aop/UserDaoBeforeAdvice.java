package com.th.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @ClassName: UserDaoBeforeAdvice
 * @Description: 增强代码
 * @Author: 唐欢
 * @Date: 2022/7/5 17:10
 * @Version 1.0
 */
public class UserDaoBeforeAdvice implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] objects, Object o) throws Throwable {
		System.out.println("正在执行前置增强操作…………");
	}
}