package cn.sxt.test;

// 测试时间对象和字符串之间的互相转换
// 作用：把时间对象转化成指定格式的字符串。反之，把指定格式的字符串转化成时间对象。

// 
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// DateFormat是一个抽象类。一般使用SimpleDateFormat类。
public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		// NEW 出 SimpleDateFormat对象
			SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			SimpleDateFormat s2 = new SimpleDateFormat("yyyy-MM-dd");
//			SimpleDateFormat s2 = new SimpleDateFormat("yyyy年MM月dd日");
			
			// 将时间对象转换成字符串
			String dayTime = s1.format(new Date());
			System.out.println(s2.format(new Date())); // 2018-10-19
			// 05:03:43
			
			System.out.println(new SimpleDateFormat("hh:mm:ss").format(new Date())); 
			
			// 把字符串按照“格式字符串指定的格式”转化为相应的对象
			DateFormat dd = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
			
			Date date = dd.parse("1983年5月7日 19时23分23秒");
			System.out.println(date);
			
			// 测试其它字符格式 比如利用D 获得时间对象处于当年期日的多少天
			DateFormat df3 = new SimpleDateFormat("D");
			String str3 = df3.format(new Date());
			System.out.println(str3); //293 当前一年的多少天
			
			
	}
}
