package com.th.annoautowire;

import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @ClassName: UserDaoImpl
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/5 15:48
 * @Version 1.0
 */
@Repository("userDao")
public class UserDaoImpl implements  UserDao{

	@Override
	public void print() {
		System.out.println("C语言中文网");
	}
}