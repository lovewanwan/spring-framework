package com.th.aop.annoaspectJ;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @ClassName: myPointCut
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/7 15:08
 * @Version 1.0
 */

public class myPointCut {

	@Pointcut("execution(*com.th.aop.annoaspectJ.myAspectJ.*(..))")
	private  void myPointCut(){

	}

	/**
	 * 将 com.th.aop.xmlaspectJ包下 OrderDao 类中的 get() 方法定义为一个切点
	 */
	@Pointcut(value = "execution(* com.th.aop.xmlaspectJ.OrderDao.get(..))")
	public  void pointCut1(){

	}

	/**
	 * 将 com.th.aop.xmlaspectJ包下 OrderDao 类中的 modify() 方法定义为一个切点
	 */
	@Pointcut(value = "execution(* com.th.aop.xmlaspectJ.OrderDao.modify())")
	public  void  pointCut2(){

	}

	/**
	 * 除了 org.example.dao包下 UserDao 类中 get() 方法和 delete() 方法外，其他方法都定义为切点
	 *
	 * ！ 表示 非
	 * && 表示 与
	 * || 表示 或
	 */
	@Pointcut(value = "!pointCut1()&& !pointCut2()")
	public  void  pointCut3(){

	}


	@Before("pointCut3()")
	public  void around() throws  Throwable{
		System.out.println("环绕增强。。。");
	}

	@AfterReturning(value = "execution(* com.th.aop.xmlaspectJ.OrderDao.add(..))" ,returning = "returnValue")
	public  void  afterReturning(Object returnValue){
		System.out.println("方法返回值："+returnValue);
	}
}