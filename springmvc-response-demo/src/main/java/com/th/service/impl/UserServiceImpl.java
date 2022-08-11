package com.th.service.impl;

import com.th.dao.UserDao;
import com.th.entity.User;
import com.th.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserServiceImpl
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/8/4 15:29
 * @Version 1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public User getUserByUserName(String userName) {
		return userDao.getUserByUserName(userName);
	}
}