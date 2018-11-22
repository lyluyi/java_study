package com.sxt.io;

import java.io.File;

/*
 * ʹ�õݹ�
 * 
 * ��ӡ�¼�Ŀ¼
 * 
 * */

public class DirDemo04 {
		public static void main(String[] args) {
				
				File src = new File("D:/test");
				
				// ��ӡ���ＶĿ¼������
				printName(src, 0);
				
		}
		
		public static void printName(File src, int deep) {
				for (int i = 0; i < deep; i++) {
						System.out.print("-");
				}
				
				System.out.println(src.getName());
				
				if (null == src || !src.exists()) { // �Ƿ����  �ݹ�ͷ
						return;
				} else if (src.isDirectory()) { // �Ƿ�ΪĿ¼ �ݹ���
						
						// ѭ����� ���Ⱥ� ���Ƚ���Ŀ¼����ı��� �����ǰĿ¼��������Ŀ¼ ��ô�����Ŀ¼ѭ��
						
						// ���ȱ������ ��������ڲ㼴�����ڲ���� �ڲ�������ȼ���
						for (File s : src.listFiles()) {  
								printName(s, deep + 1);
						}
				}
		}
}
