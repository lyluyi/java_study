package cn.sxt.test;

import java.io.Console;

// ����StringBuilder  StringBuffer�ɱ��ַ����кͲ��ɱ��ַ�����ʹ�õ�ע���

public class TestStringBuilder2 {
	public static void main(String[] args) {
		
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < 26; i++) {
				// char�����ǿ����������Ϊchar��ASCII���ַ���������ж�Ӧ����ֵ��
			 //	 ��JAVA�У���char�����ַ�����ʱ��ֱ�ӵ���ASCII���Ӧ���������Դ���	
			// char m='a'+1;��������b��//����Ϊint��������98��Ӧ���ַ���b��
				char temp = (char)('a' + i); 
				sb.append(temp); // β������
			}
			System.out.println(sb);
			
			sb.reverse(); // ����
			System.out.println(sb);
//			sb.setCharAt(3, 'aaaa');  // ���� lang���� û�ж�Ӧ��API
			
			sb.insert(0, '��').insert(3, '��').insert(6, 'a');
			
			System.out.println(sb);
			
			
	}
}
