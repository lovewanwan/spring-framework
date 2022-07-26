package com.th.transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

/**
 * @ClassName: MainApp
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/11 10:57
 * @Version 1.0
 */
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/transactionXmlBeans.xml");
		OrderService orderService =context.getBean("orderService",OrderService.class);
		Order order =new Order();
		//设置商品 id
		order.setProductId("1");
		//商品数量为 30
		order.setCount(30);
		//商品金额为 600
		order.setMoney(new BigDecimal(600));
		//设置用户 id
		order.setUserId("1");
		//订单状态为未完成
		order.setStatus(0);
		orderService.createOrder(order);
	}
}