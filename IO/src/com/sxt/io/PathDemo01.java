package com.sxt.io;

import java.io.File;

// IO �ļ���  File���separator����separatorCharת���ɵ�  һ�����ַ�����һ�����ַ�

public class PathDemo01 {
		public static void main(String[] args) {
				/*
				 * 
				 * \ Ϊ���Ʒָ���  ʵ�ʾ���ת���ַ� separator
				 * 
				 * */
				
				// separator����separatorCharת���ɵ�  һ�����ַ�����һ�����ַ�
				
				String path = "D:\\workspace\\IO\\src\\IO.jpg";
				
				System.out.println(File.separatorChar); // �����\ 
				
				// ����������·�� ��д����ʽ
				
				// 1��
				path = "D:/workspace/IO/src/IO.jpg"; // �� \\ ȫ��д�� /
				System.out.println(path); // D:/workspace/IO/src/IO.jpg
				
				// 2 ����ƴ��
				path = "D:" + File.separator + "workspace" + File.separator + "IO" + File.separator + "src" + File.separator + "IO.jpg";
				
				System.out.println(path); // D:\workspace\IO\src\IO.jpg
				
				// �����ֱ�ʾ��������Ϊʲô�� ��ʾ�Ľ����һ�µ�
				
				
				
		}
}
