package cn.sxt.test;

// ����ʱ�������ַ���֮��Ļ���ת��
// ���ã���ʱ�����ת����ָ����ʽ���ַ�������֮����ָ����ʽ���ַ���ת����ʱ�����

// 
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// DateFormat��һ�������ࡣһ��ʹ��SimpleDateFormat�ࡣ
public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		// NEW �� SimpleDateFormat����
			SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			SimpleDateFormat s2 = new SimpleDateFormat("yyyy-MM-dd");
//			SimpleDateFormat s2 = new SimpleDateFormat("yyyy��MM��dd��");
			
			// ��ʱ�����ת�����ַ���
			String dayTime = s1.format(new Date());
			System.out.println(s2.format(new Date())); // 2018-10-19
			// 05:03:43
			
			System.out.println(new SimpleDateFormat("hh:mm:ss").format(new Date())); 
			
			// ���ַ������ա���ʽ�ַ���ָ���ĸ�ʽ��ת��Ϊ��Ӧ�Ķ���
			DateFormat dd = new SimpleDateFormat("yyyy��MM��dd�� hhʱmm��ss��");
			
			Date date = dd.parse("1983��5��7�� 19ʱ23��23��");
			System.out.println(date);
			
			// ���������ַ���ʽ ��������D ���ʱ������ڵ������յĶ�����
			DateFormat df3 = new SimpleDateFormat("D");
			String str3 = df3.format(new Date());
			System.out.println(str3); //293 ��ǰһ��Ķ�����
			
			
	}
}
