package com.th.annotransation;

/**
 * @ClassName: Storage
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/11 9:56
 * @Version 1.0
 */
public class Storage {
	private  Long id;

	private String productId;

    /**
     * 商品库存总数
	 */
	private  Integer total;


    /**
     * 已用商品数量
	 */
	private  Integer used;

    /**
     * 剩余商品数量
	 */
	private Integer residue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getUsed() {
		return used;
	}

	public void setUsed(Integer used) {
		this.used = used;
	}

	public Integer getResidue() {
		return residue;
	}

	public void setResidue(Integer residue) {
		this.residue = residue;
	}

	@Override
	public String toString() {
		return "Storage{" +
				"id=" + id +
				", productId='" + productId + '\'' +
				", total=" + total +
				", used=" + used +
				", residue=" + residue +
				'}';
	}
}