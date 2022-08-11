package com.th.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @ClassName: MyDateConverter
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/8/9 15:53
 * @Version 1.0
 */
public class MyDateConverter implements Converter<String, Date> {
	private String datePatten ="yyyy-MM-dd";
	@Override
	public Date convert(String source) {
		System.out.println(source);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePatten);
		try {
			return  simpleDateFormat.parse(source);
		}catch (ParseException e){
			throw  new IllegalArgumentException("无效的日期格式,请使用正确的日期格式"+datePatten);
		}
	}
}