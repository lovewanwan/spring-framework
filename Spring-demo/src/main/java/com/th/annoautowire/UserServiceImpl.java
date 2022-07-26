package com.th.annoautowire;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: UserServiceImpl
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/5 15:54
 * @Version 1.0
 */
@Service("userService")
public class UserServiceImpl implements  UserService{
	@Resource
	private  UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void out() {
		userDao.print();
		System.out.println("一个java开发者网站");
	}
}