package com.sxt.server.basic;

import java.lang.reflect.InvocationTargetException;

/*
 * 
 * ���䣺��java���еĸ��ֽṹ�����������ԡ���������������ӳ���һ����java����
 * 
 *  ���ַ�ʽ�� Class.forName("����.����")
 *  
 *  clz.getConstructor().newInstance()
 * 
 */

public class ReflectTest {

		public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
				
				// ���ַ�ʽ
				
				// 1 ����.getClass()
				
				Iphone iphone = new Iphone();
				Class clz = iphone.getClass();
				
				// 2. ��.class
				
				clz = Iphone.class;
				
				// 3. Class.forName("����.����")
				
				clz = Class.forName("com.sxt.server.basic.Iphone");
				
				// ͨ�������ȡ����� �������� ͨ���������ķ���  JDK 9�����Ƽ�
				
				Iphone iphone2 = (Iphone)clz.getConstructor().newInstance();
				
				System.out.println(iphone2);
				
		}
}

class Iphone {
	public Iphone()	{ // �޲ι���
			
	}
}