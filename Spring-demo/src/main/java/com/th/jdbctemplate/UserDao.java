package com.th.jdbctemplate;

import java.util.List;

/**
 * @ClassName: UserDao
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/7 16:54
 * @Version 1.0
 */
public interface UserDao {
	/**
	 * 新增一条用户
	 *
	 * @param user
	 * @return
	 */
	int addUer(User user);
	/**
	 * 更新指定的用户信息
	 *
	 * @param user
	 * @return
	 */
	int update(User user);
	/**
	 * 删除指定的用户信息
	 *
	 * @param user
	 * @return
	 */
	int delete(User user);
	/**
	 * 统计用户个数
	 *
	 * @param user
	 * @return
	 */
	int count(User user);
	/**
	 * 查询用户列表
	 *
	 * @param user
	 * @return
	 */
	List<User> getList(User user);
	/**
	 * 查询单个用户信息
	 *
	 * @param user
	 * @return
	 */
	User getUser(User user);
	/**
	 * 批量增加用户
	 *
	 * @param batchArgs
	 */
	void batchAddUser(List<Object[]> batchArgs);
}