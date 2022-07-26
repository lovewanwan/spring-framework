package com.th.setter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @ClassName: Student
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/1 13:40
 * @Version 1.0
 */
public class Student {
	private static final Log LOGGER = LogFactory.getLog(Student.class);

	private  int id;

	private  String name;

	private  Grade grede;

	public Student() {
	}

	public void setId(int id) {
		LOGGER.info("正在执行 Student 类的 setId() 方法…… ");
		this.id = id;
	}

	public void setName(String name) {
		LOGGER.info("正在执行 Student 类的 setName() 方法…… ");
		this.name = name;
	}

	public void setGrede(Grade grede) {
		LOGGER.info("正在执行 Student 类的 setGrade() 方法…… ");
		this.grede = grede;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", grede=" + grede +
				'}';
	}
}