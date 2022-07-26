package com.th.autowire;

/**
 * @ClassName: Employee
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/5 13:42
 * @Version 1.0
 */
public class Employee {

	private  String empNo;
	private  String empName;
	private  Dept dept;

	public Employee() {
		System.out.println("正在执行Employee的无参构造方法。。。。");
	}

	public Employee(String empNo, String empName, Dept dept) {
		System.out.println("正在执行Employee的有参构造方法。。。");
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
	}

	public void setEmpNo(String empNo) {
		System.out.println("正在执行 Employee 的 setEmpNo 方法>>>>");
		this.empNo = empNo;
	}

	public void setEmpName(String empName) {
		System.out.println("正在执行 Employee 的 setEmpName 方法>>>>");
		this.empName = empName;
	}

	public void setDept(Dept dept) {
		System.out.println("正在执行 Employee 的 setDept 方法>>>>");
		this.dept = dept;
	}

	public String getEmpNo() {
		return empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public Dept getDept() {
		return dept;
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