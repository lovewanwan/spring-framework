package com.th.transaction;

/**
 * @ClassName: OrderService
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/11 10:46
 * @Version 1.0
 */
public interface OrderService {

	/**
	 * 创建订单
	 * @param order
	 */
	public  void createOrder(Order order);
}
