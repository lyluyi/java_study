package com.sxt.io;

import java.io.UnsupportedEncodingException;

// ���� �ַ��� �ֽ�

public class ContentDecode {
		
		public static void main(String[] args) throws UnsupportedEncodingException {
				
				String msg = "����ʹ������";
				
				// ���� �ֽ�����
				
				byte[] datas = msg.getBytes(); // Ĭ��ʹ�ù��̵��ַ���GBK UTF-8 ��һ�������ַ�ռ�����ֽ�
				
				System.out.println(datas.length); // 18
				
				// ���룺 
				msg = new String(datas,0,datas.length,"GBK"); // Ĭ�����ַ���
				
				System.out.println(msg);
				
				// ������ڵ��������� 1���ֽ������� 2���ַ�����ͳһ
		}
}