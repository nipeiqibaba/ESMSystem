package com.neu.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		
		Date date = null;
		try {
			date = f.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return date;
	}
}
