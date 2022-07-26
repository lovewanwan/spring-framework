package com.th.autowire;

/**
 * @ClassName: Dept
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/5 13:33
 * @Version 1.0
 */
public class Dept {
	private  String deptNo;

	private  String deptName;

	public Dept() {
		System.out.println("正在执行Dept的去参构造方法....");
	}

	public Dept(String deptNo, String deptName) {
		System.out.println("正在执行Dept的有参构造方法...");
		this.deptNo = deptNo;
		this.deptName = deptName;
	}

	public void setDeptNo(String deptNo) {
		System.out.println("正在执行 Dept 的 setDeptNo 方法>>>>");
		this.deptNo = deptNo;
	}

	public void setDeptName(String deptName) {
		System.out.println("正在执行 Dept 的 setDeptName 方法>>>>");
		this.deptName = deptName;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	@Override
	public String toString() {
		return "Dept{" +
				"deptNo='" + deptNo + '\'' +
				", deptName='" + deptName + '\'' +
				'}';
	}
}