package com.th.controller;

import com.th.bean.User;
import com.th.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @ClassName: LoginController
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/8/8 14:16
 * @Version 1.0
 */
@Controller
public class LoginController {
	@Autowired
	private UserDao userDao;

	@RequestMapping("/login")
	public  String login(User user, HttpServletRequest request){
		User loginUser = userDao.getUserByUserName(user.getUserName());
		if (loginUser!=null && loginUser.getPassword().equals(user.getPassword())){
			HttpSession session =request.getSession();
			//将用户信息放到session 域中
			session.setAttribute("loginUser",loginUser);
			//重定向到商品列表
			return  "redirect:/products";
		}
		request.setAttribute("msg","账号或密码错误");
		return "login";
	}

}