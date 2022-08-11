package com.th.service;

import com.th.entity.Product;

import java.util.List;

/**
 * @ClassName: ProductService
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/8/4 15:27
 * @Version 1.0
 */
public interface ProductService {

	List<Product> getProductList();

	Product getProductById(Integer productId);
}
