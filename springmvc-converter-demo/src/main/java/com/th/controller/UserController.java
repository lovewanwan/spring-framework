package com.th.controller;

import com.th.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName: UserController
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/8/9 15:49
 * @Version 1.0
 */
@Controller
public class UserController {
	@RequestMapping(value="/user" ,method = RequestMethod.POST)
	public  String login(User user, Model model){
		System.out.println(user);
		model.addAttribute("user",user);
		return "success";
	}
}