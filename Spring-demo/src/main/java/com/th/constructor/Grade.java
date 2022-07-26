package com.th.constructor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @ClassName: Grade
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/6/30 16:54
 * @Version 1.0
 */
public class Grade {
	private  static final Log LOGGER = LogFactory.getLog(Grade.class);
	private  Integer gradeId;
	private String gradeName;

	public Grade(Integer gradeId, String gradeName) {
		LOGGER.info("正在执行Course的有参构造方法，参数分别为GradeId =" +gradeId +",gradeName = "+gradeName);
		this.gradeId = gradeId;
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