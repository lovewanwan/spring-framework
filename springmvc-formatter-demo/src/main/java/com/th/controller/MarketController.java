package com.th.controller;

import com.th.bean.Supermarket;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName: MarketController
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/8/9 16:44
 * @Version 1.0
 */
@Controller
public class MarketController {

	@RequestMapping(value = "/market", method = RequestMethod.POST)
	public String login(Supermarket supermarket, Model model){
		model.addAttribute("market",supermarket);
		return "success";
	}
}