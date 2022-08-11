package com.th.service.impl;

import com.th.dao.ProductDao;
import com.th.entity.Product;
import com.th.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: ProductServceImpl
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/8/4 15:32
 * @Version 1.0
 */
@Service("productService")
public class ProductServceImpl implements ProductService {
	@Autowired
	public ProductDao productDao;
	@Override
	public List<Product> getProductList() {
		return productDao.getProductList();
	}

	@Override
	public Product getProductById(Integer productId) {
		return productDao.getProductById(productId);
	}
}