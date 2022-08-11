package com.th.service;

import com.th.entity.User;

/**
 * @ClassName: UserService
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/8/4 15:28
 * @Version 1.0
 */
public interface UserService {
	User getUserByUserName(String userName);
}
