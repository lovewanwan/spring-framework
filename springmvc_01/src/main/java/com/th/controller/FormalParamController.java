package com.th.controller;

import com.th.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.xml.crypto.KeySelector;

/**
 * @ClassName: FormalParamController
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/8/2 14:27
 * @Version 1.0
 */
@Controller
public class FormalParamController {

	@RequestMapping("/userLogin")
	public  String  userLogin(){
		return "userlogin";
	}

	@RequestMapping("/getFormalParam")
	public  String getFormalParam(String userId,String userName,String password){
		System.out.println("userId = " + userId + ", userName = " + userName + ", password = " + password);
		return "success";
	}
	@RequestMapping(value = "/getUser",method = RequestMethod.POST)
	public  String getUser(User user){
		System.out.println("userId = " + user.getUserId());
		System.out.println("userName = " + user.getUserName());
		System.out.println("password = " + user.getPassword());
		return "success";
	}
}