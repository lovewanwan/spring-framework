package com.th.controller.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: HelloController
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/29 15:02
 * @Version 1.0
 */
@Controller
public class HelloController {

	@RequestMapping("/")

	public String sayHello(){
		// 视图名,视图为: 视图前缀+index+视图后缀名,即/WEB-INF/templates/index.html
		return  "index";
	}

	@RequestMapping(value = "/login",name = "跳转到登录页面",method = {RequestMethod.GET,RequestMethod.POST})
	public String welcome(){
		// 视图名,视图为: 视图前缀+index+视图后缀名,即/WEB-INF/templates/index.html
		return  "login";
	}

	@RequestMapping(value = "/testParam", headers  =  "Referer=http://java.biancheng.net")
	@ResponseBody
	public String testParam() {
		return "success";
	}

	@RequestMapping("/register")
	public String success(){
		// 视图名,视图为: 视图前缀+index+视图后缀名,即/WEB-INF/templates/index.html
		return  "register";
	}
}