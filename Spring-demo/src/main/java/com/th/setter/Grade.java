package com.th.setter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @ClassName: Grade
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/1 13:42
 * @Version 1.0
 */
public class Grade {
	private  static final Log LOGGER = LogFactory.getLog(Grade.class);

	private  Integer gradeId;

	private  String gradeName;

	public Grade() {
	}

	public void setGradeId(Integer gradeId) {
		LOGGER.info("正在执行 Grade 类的 setGradeId() 方法…… ");
		this.gradeId = gradeId;
	}

	public void setGradeName(String gradeName) {
		LOGGER.info("正在执行 Grade 类的 setGradeName() 方法…… ");
		this.gradeName = gradeName;
	}

	@Override
	public String toString() {
		return "Grade{" +
				"gradeId=" + gradeId +
				", gradeName='" + gradeName + '\'' +
				'}';
	}
}