package com.th.controller;

import com.th.bean.Product;
import com.th.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: ProductController
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/8/10 13:31
 * @Version 1.0
 */
@Controller
public class ProductController {
	@Autowired
	private ProductDao productDao;


	@ResponseBody
	@RequestMapping("/product/{productId}")
	public Product getProduct(@PathVariable("productId") String productId){
		Product product = productDao.getProductById(productId);
		return  product;
	}


	/**
	 * 新增商品
	 *
	 * @param product
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public Product addProduct(@RequestBody Product product) {
		productDao.addProduct(product);
		return product;
	}
	/**
	 * 删除指定的商品
	 *
	 * @param productId
	 * @return
	 */
	@RequestMapping(value = "/product", method = RequestMethod.DELETE)
	public String deleteProduct(String productId) {
		productDao.deleteProduct(productId);
		return "redirect:/products";
	}
	/**
	 * 获取商品列表
	 *
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getProductList")
	public List<Product> getProductList() {
		List productList = productDao.getProductList();
		return productList;
	}

	@RequestMapping("/test")
	public String test(){
		return "test";
	}

	/**
	 * 修改商品信息
	 *
	 * @param product
	 * @return
	 */
	@RequestMapping(value = "/edit-product")
	public String updateProduct(Product product) {
		productDao.updateProduct(product);
		return "redirect:/products";
	}
}