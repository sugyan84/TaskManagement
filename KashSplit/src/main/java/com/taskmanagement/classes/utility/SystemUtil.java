package com.taskmanagement.classes.utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SystemUtil
{
	private static final DateTimeFormatter SYS_DATE_TIME_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

	public static DateTimeFormatter getSysDateTimeFormat()
	{
		return SYS_DATE_TIME_FORMAT;
	}
	
	public static LocalDateTime getDateTimeNow()
	{
		String formatedDateTimeString = LocalDateTime.now().format(getSysDateTimeFormat());
		
		LocalDateTime formatDateTime = LocalDateTime.parse(formatedDateTimeString, getSysDateTimeFormat());
		
		return formatDateTime;
	}
}
