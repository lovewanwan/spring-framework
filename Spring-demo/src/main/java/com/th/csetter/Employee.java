package com.th.csetter;

/**
 * @ClassName: Employee
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/1 14:50
 * @Version 1.0
 */
public class Employee {
	private  String empNo;

	private  String empName;

	private  Dept dept;

	public Employee(String empNo, String empName, Dept dept) {
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"empNo='" + empNo + '\'' +
				", empName='" + empName + '\'' +
				", dept=" + dept +
				'}';
	}
}