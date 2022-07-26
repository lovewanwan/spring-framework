package com.th.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * @ClassName: AccountDaoImpl
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/11 10:18
 * @Version 1.0
 */
@Repository("accountDao")
public class AccountDaoImpl implements  AccountDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Account selectByUserId(String userId) {
		String sql = "  select * from t_account where user_id = ?";
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Account>(Account.class), userId);
	}

	@Override
	public int decrease(String userId, BigDecimal money) {
		String sql = "UPDATE t_account SET residue = residue - ?, used = used + ? WHERE user_id = ?;";
		return jdbcTemplate.update(sql, money, money, userId);
	}
}