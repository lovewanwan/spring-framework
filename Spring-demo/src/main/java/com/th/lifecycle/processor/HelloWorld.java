package com.th.lifecycle.processor;

/**
 * @ClassName: HelloWorld
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/4 16:38
 * @Version 1.0
 */
public class HelloWorld {
	private  String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public  void init(){
		System.out.println("Bean 正在初始化");
	}

	public  void destroy(){
		System.out.println("Bean 将要被销毁");
	}
}