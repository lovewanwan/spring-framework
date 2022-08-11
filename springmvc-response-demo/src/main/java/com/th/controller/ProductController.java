package com.th.controller;

import com.th.entity.Product;
import com.th.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @ClassName: ProductController
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/8/4 15:39
 * @Version 1.0
 */
@Controller
public class ProductController {
	@Autowired
	private ProductService productService;

	@RequestMapping("/getProductList")
	public ModelAndView getProductList(){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("productList");
		List<Product> productList = productService.getProductList();

		modelAndView.addObject(productList);
		return modelAndView;
	}

	@RequestMapping("getProduct")
	public  String getProduct(Integer productId, Model model){
		Product productById = productService.getProductById(productId);
		model.addAttribute("product",productById);
		return "product";
	}
}