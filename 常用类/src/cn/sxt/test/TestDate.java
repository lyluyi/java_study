package cn.sxt.test;

import java.util.Date;

// ����ʱ����

public class TestDate {
	public static void main(String[] args) {
		Date d = new Date(); // ��ǰʱ�� ����ֵ
		
		System.out.println(d);
//		Date dd = new Date(2);
//		System.out.println(dd);
		
		Date d2 = new Date();
		System.out.println(d2.getTime()); // 1539938350775
		System.out.println(d2.after(d));  // true
		
		// ʱ�䴦����  Canlendar���� �ַ���ת�� DateFormat
	}

}
