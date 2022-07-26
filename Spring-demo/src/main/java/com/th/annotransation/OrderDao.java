package com.th.annotransation;

/**
 * @ClassName: OrderDao
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/11 10:05
 * @Version 1.0
 */
public interface OrderDao {

	/**
	 * 创建订单
	 * @param order
	 * @return
	 */
	public  int createOrder(Order order);

    /**
     *  修改订单状态
	 *  将订单状态从未完成（0） 修改为已完成（1）
	 * @param orderId
     * @param status
	 */
	public  void updateOrderStatus(String orderId,Integer status);
}