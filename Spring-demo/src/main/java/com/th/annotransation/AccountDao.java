package com.th.annotransation;

import java.math.BigDecimal;

/**
 * @ClassName: AccountDao
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/11 10:41
 * @Version 1.0
 */
public interface AccountDao {

    /**
     * 根据用户查询账户金额
	 * @param userId
     * @return
     */
	Account selectByUserId(String userId);

    /**
     * 扣减账户金额
	 * @param userId
     * @param money
     * @return
     */
	int decrease(String userId, BigDecimal money);
}