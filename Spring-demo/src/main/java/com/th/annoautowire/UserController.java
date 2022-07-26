package com.th.annoautowire;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @ClassName: UserController
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/5 15:57
 * @Version 1.0
 */
@Controller("userController")
public class UserController {

	@Resource
	private  UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public  void  doStr(){
		userService.out();
		System.out.println("专注分享java优质编程教程");
	}
}