package com.th.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName: RequestMappingController
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/8/2 10:13
 * @Version 1.0
 */
@Controller
@RequestMapping("/requestMapping")
public class RequestMappingController {

	/**
	 *  value,name,method属性
	 * @return
	 */
	@RequestMapping(value={"/welcome","/do"},name = "跳转到欢迎页",method = RequestMethod.GET)
	public  String testValue(){
		return  "welcome";
	}

	/**
	 * 注解params 属性
	 * @return
	 */
	@RequestMapping(value = "/testParam",params = {"name=requestMapping", "url=http://java.biancheng.net"})

	public  String params(){
		return  "param";
	}

	/**
	 * 注解headers 属性
	 * @return
	 */
	@RequestMapping(value = "/testHeader",headers = {"Content-Type=application/json", "Referer=http://java.biancheng.net"})

	public  String headers(){
		return  "header";
	}
}