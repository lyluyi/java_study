package cn.sxt.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

//���ǻ���������  �ڶ����汾

//��д��������GregorianCalendar�࣬��ӡ��ǰ�·ݵ�������
// ����������� 2017-05-18 ����ͼ8-19��ʾΪ���������·ݵ�������

public class TestCalendarTask2 {
	public static void main(String[] args) throws ParseException {
		 System.out.println("���������ڣ���ʽ��2020-9-10��");
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 String str = scanner.nextLine();
			
//		 String str = "2020-10-10";
		 //DateFormat�������
     //��ʱ�����ת����ָ����ʽ���ַ�������֮����ָ����ʽ���ַ���ת����ʱ�����
     //DateFormat��һ�������࣬һ��ʹ�����ĵ�����SimpleDateFormat����ʵ�֡�
		 DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		 Date date = df.parse(str);  
		 System.out.println(date); // Sat Oct 10 00:00:00 CST 2020
		 Calendar c = new GregorianCalendar();
		 c.setTime(date);
//		 System.out.println(c);
		 
		 int currentDay = c.get(Calendar.DAY_OF_MONTH);
		 int days = c.getActualMaximum(Calendar.DATE);
		 
		 
		 System.out.println("��\tһ\t��\t��\t��\t��\t��"); // java ת���ַ� �Ʊ�� \t 
		 
		 c.set(Calendar.DAY_OF_MONTH, 1); // �������һ����ʼ����  1��
		 
		 for (int i = 0; i < c.get(Calendar.DAY_OF_WEEK) - 1; i++) {  
				 // ��ȡ��ǰ�յ������� ������Ʊ�ո�
				System.out.print("\t");
		 }
		 
	
		 for (int i = 1; i <= days; i++) {
				 
				 if (currentDay == c.get(Calendar.DAY_OF_MONTH)) {
						System.out.print(c.get(Calendar.DAY_OF_MONTH) + "*\t");
				 } else {
						System.out.print(c.get(Calendar.DAY_OF_MONTH) + "\t");
				}
				 
				 //  c.getActualMaximum(Calendar.DATE)
				 // ��ȡ�����·� �����������ֵ
//				System.out.print(c.get(Calendar.DAY_OF_MONTH) + "\t");
			
				if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
					// ������Ϊ������ʱ�� ����
					System.out.println();
				}
				c.add(Calendar.DAY_OF_MONTH, 1);
		 }
	}
}
