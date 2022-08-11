package com.th.controller;

import com.th.bean.Product;
import com.th.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @ClassName: ProductController
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/8/8 14:35
 * @Version 1.0
 */
@Controller
public class ProductController {

	@Autowired
	private ProductDao productDao;

	@RequestMapping("/products")
	public  String getProductList(Model model){
		List productList= productDao.getProductList();
		model.addAttribute("productList",productList);
		return  "product_list";
	}

	@RequestMapping("/product/{action}/{productId}")
	public  String getProductList(@PathVariable("action") String action,@PathVariable("productId") String productid,Model model){
		Product product= productDao.getProductById(productid);
		model.addAttribute("product",product);
		//根据参数action 判断跳转到商品详细信息页还是商品修改页
		if (action.equals("get")){
			return  "product_info";
		}else{
			return  "product_update";
		}
	}

	@RequestMapping(value = "/addProduct",method = RequestMethod.POST)
	public String addProduct(Product product){
		productDao.addProduct(product);
		return "redirect:/products";
	}
	/**
	 * 修改商品信息
	 * @param product
	 * @return
	 */
	@RequestMapping(value = "/updateProduct", method = RequestMethod.PUT)
	public String updateProduct(Product product) {
		productDao.updateProduct(product);
		return "redirect:/products";
	}
	/**
	 * 删除商品
	 * @param productId
	 * @return
	 */
	@RequestMapping(value = "/deleteProduct", method = RequestMethod.DELETE)
	public String deleteProduct(String productId) {
		productDao.deleteProduct(productId);
		return "redirect:/products";
	}

	@RequestMapping("/addPage")
	public  String addpage(){
		return  "product_add";
	}

}