package com.th.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: OrderDaoImpl
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/11 10:09
 * @Version 1.0
 */
@Repository("orderDao")
public class OrderDaoImpl implements  OrderDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int createOrder(Order order) {
		String sql = "insert into t_orders (order_id,user_id, product_id, `count`, money, status) values (?,?,?,?,?,?)";
		int update =jdbcTemplate.update(sql,order.getOrderId(),order.getUserId(),order.getProductId(),order.getCount(),order.getMoney(),order.getStatus());
		return  update;
	}

	@Override
	public void updateOrderStatus(String orderId, Integer status) {
		String sql = " update t_orders  set status = 1 where order_id = ? and status = ?";

		jdbcTemplate.update(sql,orderId,status);
	}
}