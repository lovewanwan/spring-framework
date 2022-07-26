package com.th.dao;

import com.th.pojo.User;

/**
 * @ClassName: UserMapper
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/26 15:53
 * @Version 1.0
 */
public interface UserMapper {
	User selectByPrimaryKey(Integer id);
}