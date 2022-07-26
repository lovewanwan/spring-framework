package com.th.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName: HomeController
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/6/29 16:46
 * @Version 1.0
 */
@Controller
public class HomeController {

	@GetMapping("/")
	public  String home(){
		return  "home";
	}


}