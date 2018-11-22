package cn.sxt.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.text.html.CSS;

// �����������ʹ��

public class TestCanlendar {
	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar(2999,10,9,22,10,50);
		
		System.out.println(calendar); // һ��������ֵ ��Ҫ��get����ȡ����Ӧ������ֵ
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		int day = calendar.get(Calendar.DATE);
		
		System.out.println(year); // 2999
		System.out.println(month); // 10 0-11 �ֱ��Ӧ��Ӧ1-12��
		System.out.println(week); // 1-7 7 ������
		System.out.println(day); // 9��
		
		// �������ڵ����Ԫ��
		
		Calendar c2 = new GregorianCalendar();
		c2.set(calendar.YEAR, 8012);
		
		System.out.println(c2.get(Calendar.YEAR)); // 8012
		
		// ���ڵļ���
		Calendar c3 = new GregorianCalendar(); // ��ȡ��ǰ����
		c3.add(calendar.YEAR, -100); // ��ǰ��100��
		System.out.println(c3.get(calendar.YEAR)); // 1918
		
		// ���ڶ����ʱ������ת��
		Date d4 = c3.getTime(); // ���ڶ��� תʱ�����
		Calendar c4 = new GregorianCalendar();
		c4.setTime(new Date()); // ʱ�����ת���ڶ���
		
		printCalendar(c4);
		
	}
	
	public static void printCalendar (Calendar c) {
		// ��װ������� 1918��10��10��11��23��45����
			int year = c.get(Calendar.YEAR);
			int month = c.get(Calendar.MONTH) + 1;
			int date = c.get(Calendar.DAY_OF_MONTH);
			int dayweek = c.get(Calendar.DAY_OF_WEEK) - 1; // 1-7 1���� ����-1
			
			String dayweek2 = dayweek == 0 ? "��": dayweek + "";
			
			int hour = c.get(Calendar.HOUR);
			int minute = c.get(Calendar.MINUTE);
			int second = c.get(Calendar.SECOND);
			
			System.out.println(year + "��" +  month + "��" + date + "��" + hour + "ʱ" + minute + "��" 
							+ second + "��" + " ��" + dayweek2);
	}
}
