package com.th.dao;

import com.th.bean.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: UserDao
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/8/8 14:21
 * @Version 1.0
 */
@Repository
public class UserDao {
	private static Map<String, User> users = null;
	static {
		users = new HashMap<String, User>();
		User user = new User();
		user.setUserId("1001");
		user.setUserName("Java用户");
		user.setPassword("987654321");
		User user2 = new User();
		user2.setUserId("1002");
		user2.setUserName("admin");
		user2.setPassword("admin");
		users.put(user.getUserName(), user);
		users.put(user2.getUserName(), user2);
	}
	/**
	 * 根据用户名获取用户信息
	 *
	 * @param userName
	 * @return
	 */
	public User getUserByUserName(String userName) {
		User user = users.get(userName);
		return user;
	}
}