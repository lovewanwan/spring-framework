package com.th.psetter;

/**
 * @ClassName: Dept
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/1 14:19
 * @Version 1.0
 */
public class Dept {
	private  String deptNo;

	private  String deptName;

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Dept{" +
				"deptNo='" + deptNo + '\'' +
				", deptName='" + deptName + '\'' +
				'}';
	}
}