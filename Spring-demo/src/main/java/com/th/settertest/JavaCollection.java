package com.th.settertest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName: JavaCollection
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/1 15:24
 * @Version 1.0
 */
public class JavaCollection {

	private  String[] courses;

	private List<String>  list;

	private Map<String,String> maps;

	private Set<String> sets;


	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}

	public void setSets(Set<String> sets) {
		this.sets = sets;
	}

	@Override
	public String toString() {
		return "JavaCollection{" +
				"courses=" + Arrays.toString(courses) +
				", list=" + list +
				", maps=" + maps +
				", sets=" + sets +
				'}';
	}
}