package com.th.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName: ForwardController
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/8/4 16:31
 * @Version 1.0
 */
@Controller
public class ForwardController {

	/**
	 * 通过控制器方法返回值实现转发
	 * @param model
	 * @return
	 */
	@RequestMapping("/testDispatcher")
	public  String testDispatcher (Model model){
		model.addAttribute("requestScope","控制器返回值:转发");
		return "forward:/user";
	}
	/**
	 * 通过 ModeAndView 实现转发
	 * @return
	 */
	@RequestMapping("/testForward2")
	public ModelAndView testForward2() {
		ModelAndView modelAndView = new ModelAndView();
		//设置逻辑视图名
		modelAndView.setViewName("forward:/user");
		//在request域对象中添加信息
		modelAndView.addObject("requestScope", "ModelAndView：转发！");
		return modelAndView;
	}
}