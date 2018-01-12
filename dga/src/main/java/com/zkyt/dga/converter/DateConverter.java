package com.zkyt.dga.converter;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
/**
 * 
 * 作 者 ： 韩宗乾
 * 描 述 ：日期类型转换器 Converter<S, T> 其中--S：source源数据类型 	T：target 目标数据类型
 * 时 间 ：2017-12-5 上午8:42:37
 */
@Component
public class DateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = simpleDateFormat.parse(source);
			return date;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
