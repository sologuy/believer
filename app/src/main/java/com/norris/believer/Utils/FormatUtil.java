package com.norris.believer.Utils;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class FormatUtil {


	public static String formatTime(int time) {
		// TODO Auto-generated method stub
		if (time == 0) {
			return "00:00";
		}
		time = time / 1000;
		int m = time / 60 % 60;
		int s = time % 60;
		return (m > 9 ? m : "0" + m) + ":" + (s > 9 ? s : "0" + s);
	}
	
	public static String formatTime(String time)
	{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date= sdf.parse(time);
			
			SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
			String str=sdf2.format(date);
			
			return str;
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return "";
		} 
	}
	
	public static String formatTimeMMdd(String time)
	{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date= sdf.parse(time);
			
			SimpleDateFormat sdf2=new SimpleDateFormat("MM-dd");
			String str=sdf2.format(date);
			
			return str;
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return "";
		} 
	}
	public static String formatTimeMMdd2(String time)
	{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date= sdf.parse(time);
			
			SimpleDateFormat sdf2=new SimpleDateFormat("MM-dd");
			String str=sdf2.format(date);
			
			return str;
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return "";
		} 
	}
	
	public static String generateTime(long time) {
		int totalSeconds = (int) (time / 1000);
		int seconds = totalSeconds % 60;
		int minutes = (totalSeconds / 60) % 60;
		int hours = totalSeconds / 3600;

		return hours > 0 ? String.format("%02d:%02d:%02d", hours, minutes, seconds) : String.format("%02d:%02d", minutes, seconds);
	}
	
	public static String formatSize(long size) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#.00");
		String fileSize = "0B";
		if (size < 1024) {
			fileSize = df.format((double) size) + "B";
		} else if (size < 1048576) {
			fileSize = df.format((double) size / 1024) + "KB";
		} else if (size < 1073741824) {
			fileSize = df.format((double) size / 1048576) + "MB";
		} else {
			fileSize = df.format((double) size / 1073741824) + "GB";
		}
		return fileSize;
	}


	public static String formatGBKStr(String s) {
		String str = null;
		try {
			str = new String(s.getBytes("ISO-8859-1"), "GB2312");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}

}
