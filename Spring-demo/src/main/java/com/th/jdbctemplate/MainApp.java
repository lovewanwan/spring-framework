package com.th.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: MainApp
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/7 17:20
 * @Version 1.0
 */
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context2 = new ClassPathXmlApplicationContext("spring/JdbcTemplateBeans.xml");
		UserService userService = context2.getBean("userService", UserService.class);
		User user = new User();
		user.setUserName("小张");
		user.setPassword("werq1232");
		user.setBithday("19920309");
		//新增一个用户
		int i = userService.addUser(user);
		System.out.println("新增用户成功！");
		/*User user1 = new User();
		user1.setUserName("小张");
		user.setPassword("werq1232");
		user.setBithday("19920309");
		int u = userService.updateUser(user1);
		System.out.println("修改用户成功");
		List<Object[]> batchArgs = new ArrayList<>();
		Object[] o1 = {"小明", "qweqrqw123213","20000302"};
		Object[] o2 = {"小龙", "qweqrqw123213","200003122"};
		Object[] o3 = {"小林", "qweqrqw123213","20000312"};
		Object[] o4 = {"小李", "qweqrqw123213","20000315"};
		batchArgs.add(o1);
		batchArgs.add(o2);
		batchArgs.add(o3);
		batchArgs.add(o4);
		userService.batchAddUser(batchArgs);
		System.out.println("批量增加完毕");
		User user2 = new User();
		user.setPassword("小张");

		int i1 = userService.countUser(user2);
		System.out.println("用户的个数为：" + i1);
		List<User> userList = userService.getUserList(user2);
		System.out.println("用户列表查询成功！");
		for (User user4 : userList) {
			System.out.println("用户 ID:" + user4.getId() + "，用户名：" + user4.getUserName() + "，生日：" + user4.getBithday());
		}*/
	}
}