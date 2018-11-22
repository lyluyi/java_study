package cn.sxt.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.text.html.CSS;

// 测试日期类的使用

public class TestCanlendar {
	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar(2999,10,9,22,10,50);
		
		System.out.println(calendar); // 一长串属性值 需要用get方法取到相应的属性值
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		int day = calendar.get(Calendar.DATE);
		
		System.out.println(year); // 2999
		System.out.println(month); // 10 0-11 分别对应相应1-12月
		System.out.println(week); // 1-7 7 星期日
		System.out.println(day); // 9号
		
		// 设置日期的相关元素
		
		Calendar c2 = new GregorianCalendar();
		c2.set(calendar.YEAR, 8012);
		
		System.out.println(c2.get(Calendar.YEAR)); // 8012
		
		// 日期的计算
		Calendar c3 = new GregorianCalendar(); // 获取当前日期
		c3.add(calendar.YEAR, -100); // 往前推100年
		System.out.println(c3.get(calendar.YEAR)); // 1918
		
		// 日期对象和时间对象的转化
		Date d4 = c3.getTime(); // 日期对象 转时间对象
		Calendar c4 = new GregorianCalendar();
		c4.setTime(new Date()); // 时间对象转日期对象
		
		printCalendar(c4);
		
	}
	
	public static void printCalendar (Calendar c) {
		// 封装输出日期 1918年10月10日11：23：45周三
			int year = c.get(Calendar.YEAR);
			int month = c.get(Calendar.MONTH) + 1;
			int date = c.get(Calendar.DAY_OF_MONTH);
			int dayweek = c.get(Calendar.DAY_OF_WEEK) - 1; // 1-7 1周日 所以-1
			
			String dayweek2 = dayweek == 0 ? "日": dayweek + "";
			
			int hour = c.get(Calendar.HOUR);
			int minute = c.get(Calendar.MINUTE);
			int second = c.get(Calendar.SECOND);
			
			System.out.println(year + "年" +  month + "月" + date + "日" + hour + "时" + minute + "分" 
							+ second + "秒" + " 周" + dayweek2);
	}
}
