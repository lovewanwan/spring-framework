package com.th.controller;

import com.th.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: ParamController
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/8/2 14:01
 * @Version 1.0
 */
@Controller
@RequestMapping("/param")
public class ParamController {

	@RequestMapping("/requestParams")
	public  String requestParams(HttpServletRequest request){
		String name = request.getParameter("name");
		String url = request.getParameter("url");

		System.out.println("name =" +name);
		System.out.println("url =" +url);
		return  "paramtest";
	}


}