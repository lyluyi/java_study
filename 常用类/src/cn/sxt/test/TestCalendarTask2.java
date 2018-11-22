package cn.sxt.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

//可是化日历程序  第二个版本

//编写程序，利用GregorianCalendar类，打印当前月份的日历，
// 今天的日期是 2017-05-18 ，如图8-19所示为今日所在月份的日历：

public class TestCalendarTask2 {
	public static void main(String[] args) throws ParseException {
		 System.out.println("请输入日期（格式：2020-9-10）");
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 String str = scanner.nextLine();
			
//		 String str = "2020-10-10";
		 //DateFormat类的作用
     //把时间对象转化成指定格式的字符串。反之，把指定格式的字符串转化成时间对象。
     //DateFormat是一个抽象类，一般使用它的的子类SimpleDateFormat类来实现。
		 DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		 Date date = df.parse(str);  
		 System.out.println(date); // Sat Oct 10 00:00:00 CST 2020
		 Calendar c = new GregorianCalendar();
		 c.setTime(date);
//		 System.out.println(c);
		 
		 int currentDay = c.get(Calendar.DAY_OF_MONTH);
		 int days = c.getActualMaximum(Calendar.DATE);
		 
		 
		 System.out.println("日\t一\t二\t三\t四\t五\t六"); // java 转义字符 制表符 \t 
		 
		 c.set(Calendar.DAY_OF_MONTH, 1); // 随便设置一个起始期日  1号
		 
		 for (int i = 0; i < c.get(Calendar.DAY_OF_WEEK) - 1; i++) {  
				 // 获取当前日的星期数 并添加制表空格
				System.out.print("\t");
		 }
		 
	
		 for (int i = 1; i <= days; i++) {
				 
				 if (currentDay == c.get(Calendar.DAY_OF_MONTH)) {
						System.out.print(c.get(Calendar.DAY_OF_MONTH) + "*\t");
				 } else {
						System.out.print(c.get(Calendar.DAY_OF_MONTH) + "\t");
				}
				 
				 //  c.getActualMaximum(Calendar.DATE)
				 // 获取当日月份 日期数的最大值
//				System.out.print(c.get(Calendar.DAY_OF_MONTH) + "\t");
			
				if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
					// 星期数为周六的时候 换行
					System.out.println();
				}
				c.add(Calendar.DAY_OF_MONTH, 1);
		 }
	}
}
