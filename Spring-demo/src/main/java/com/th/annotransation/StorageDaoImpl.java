package com.th.annotransation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: StorageDaoImpl
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/11 10:45
 * @Version 1.0
 */
@Repository("storageDao")
public class StorageDaoImpl implements StorageDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public Storage selectByProductId(String productId) {
		String sql = "select *   from t_storage where product_id = ?";
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Storage>(Storage.class), productId);
	}

	@Override
	public int decrease(Storage record) {
		String sql = " update t_storage set  used =? ,residue=? where product_id=?";
		return jdbcTemplate.update(sql, record.getUsed(), record.getResidue(), record.getProductId());
	}
}