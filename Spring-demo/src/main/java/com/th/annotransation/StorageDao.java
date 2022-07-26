package com.th.annotransation;

/**
 * @ClassName: StorageDao
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/11 10:07
 * @Version 1.0
 */
public interface StorageDao {

    /**
     * 查询商品的库存
	 * @param productId
     * @return
     */
	Storage selectByProductId(String productId);

	/**
	 * 扣减商品库存
	 * @param storage
	 * @return
	 */
	int decrease(Storage storage);
}
