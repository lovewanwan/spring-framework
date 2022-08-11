package com.th.controller;

import com.th.entity.Product;
import com.th.entity.User;
import com.th.service.ProductService;
import com.th.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @ClassName: LoginController
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/8/4 14:56
 * @Version 1.0
 */
@Controller
public class LoginController {
	@Autowired
	private UserService userService;

	@RequestMapping("/user")
	public  String sayHello(){
		return  "user";
	}

	@RequestMapping("/login")
	public  String login(User user,HttpServletRequest request){
		User user2=userService.getUserByUserName(user.getUserName());
		if (user2!=null && user2.getPassword().equals(user.getPassword())){
			HttpSession session = request.getSession();
			session.setAttribute("loginUser",user2);
			return "redirect:/getProductList";
		}
		request.setAttribute("msg","账号或密码错误");
		return  "user";
	}
}