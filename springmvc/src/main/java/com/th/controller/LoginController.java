package com.th.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: LoginController
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/28 13:42
 * @Version 1.0
 */
public class LoginController implements Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
		System.out.println("执行登录跳转");
		return  new ModelAndView("/WEB-INF/jsp/login.jsp");
	}
}