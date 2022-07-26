package com.th.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: UserDaoImpl
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/7 16:54
 * @Version 1.0
 */
@Repository("userDao")
public class UserDaoImpl implements  UserDao{
	@Resource
	private JdbcTemplate jdbcTemplate;
	@Override
	public int addUer(User user) {
		String sql = "INSERT into t_user (user_name,pass_word,bithday) value (?,?,?);";
		int update = jdbcTemplate.update(sql, user.getUserName(), user.getPassword(),user.getBithday());
		return update;
		//return 1;
	}
	@Override
	public int update(User user) {
		/*String sql = "UPDATE t_user SET pass_word=? WHERE user_name=?;";
		return jdbcTemplate.update(sql, user.getPassword(), user.getUserName());*/
		return 1;
	}
	@Override
	public int delete(User user) {
		/*String sql = "DELETE FROM t_user where user_name=?;";
		return jdbcTemplate.update(sql, user.getUserName());*/
		return 1;
	}
	@Override
	public int count(User user) {
		/*String sql = "SELECT COUNT(*) FROM t_user where user_name=?;";
		return jdbcTemplate.queryForObject(sql, Integer.class, user.getUserName());*/
		return 1;
	}
	@Override
	public List<User> getList(User user) {
		/*String sql = "SELECT * FROM t_user where user_name=?;";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class), user.getUserName());*/
		List list = new ArrayList();
		return list;
	}
	@Override
	public User getUser(User user) {
		/*String sql = "SELECT * FROM t_user where id=?;";
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), user.getId());*/
		return  user;
	}
	@Override
	public void batchAddUser(List<Object[]> batchArgs) {
		/*String sql = "INSERT into t_user (user_name,pass_word,bithday) value VALUES(?,?,?);";
		jdbcTemplate.batchUpdate(sql, batchArgs);*/
	}
}