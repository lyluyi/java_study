package cn.sxt.test;

import java.util.Date;

// 测试时间类

public class TestDate {
	public static void main(String[] args) {
		Date d = new Date(); // 当前时刻 不传值
		
		System.out.println(d);
//		Date dd = new Date(2);
//		System.out.println(dd);
		
		Date d2 = new Date();
		System.out.println(d2.getTime()); // 1539938350775
		System.out.println(d2.after(d));  // true
		
		// 时间处理用  Canlendar类来 字符串转化 DateFormat
	}

}
