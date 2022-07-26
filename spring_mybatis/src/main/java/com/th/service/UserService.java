package com.th.service;

import com.th.pojo.User;

/**
 * @ClassName: UserService
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/26 16:05
 * @Version 1.0
 */
public interface UserService {
	User selectByPrimaryKey(Integer id);
}