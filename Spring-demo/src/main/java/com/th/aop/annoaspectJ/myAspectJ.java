package com.th.aop.annoaspectJ;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @ClassName: myAspectJ
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/7 15:01
 * @Version 1.0
 */
@Component //Spring自动装配 将类的对象定义成Bean
@Aspect  //将Bean定义为切面
public class myAspectJ {
	@Before("execution(* com.th.aop.annoaspectJ.UserDao.add(..))")
	public void before(JoinPoint joinPoint) {
		System.out.println("前置增强..." + joinPoint);
	}
	@After("execution(* com.th.aop.annoaspectJ.UserDao.get(..))")
	public void after(JoinPoint joinPoint){
		System.out.println("最终增强..."+joinPoint);
	}

	//将org.example.dao下的UserDao类的get()方法定义为一个切点
	@Pointcut(value = "execution(* com.th.aop.annoaspectJ.UserDao.get(..))")
	public void pointCut1(){
	}

	//将org.example.dao下的UserDao类的delete(()方法定义为一个切点
	@Pointcut(value = "execution(* com.th.aop.annoaspectJ.UserDao.delete(..))")
	public void pointCut2(){
	}

	//使用切入点引用
	@Around("myAspectJ.pointCut2()")
	public void around(ProceedingJoinPoint point) throws Throwable{
		System.out.println("环绕增强前...");
		point.proceed();
		System.out.println("环绕增强后...");
	}

	//使用切入点表达式
	@AfterReturning(value = "execution(* com.th.aop.annoaspectJ.UserDao.modify(..))",returning = "returnValue")
	public void afterReturning(Object returnValue){
		System.out.println("后置返回增强...返回值为:"+returnValue);
	}
}