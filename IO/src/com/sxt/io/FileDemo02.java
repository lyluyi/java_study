package com.sxt.io;

import java.io.File;

// ���·�� ����·��

public class FileDemo02 {

		public static void main(String[] args) {
				
				/*
				 * ����File����
				 *  
				 * ���·��(�������̷�) �����user.dir ������Ŀ¼
				 * 
				 * ����·��(���̷�)
				 * 
				 **/
				
				String path = "D:/workspace/IO/src/IO.jpg"; 
				
				// ����·��
				File src = new File(path);
				
				System.out.println(src.getAbsolutePath()); // D:\workspace\IO\src\IO.jpg
				
       // ���·��
				System.out.println(System.getProperty("user.dir")); // D:\workspace\IO ��ȡ����Ŀ¼
				
				src = new File("IO.jpg");
				
				//	getAbsolutePath�õ�����ȫ·�������������������·����
				// �򷵻ص�ǰĿ¼�ľ���·��+�������·��������Ǿ���·����ֱ�ӷ���
				// // D:\workspace\IO ֻ�ܵ�����Ŀ¼�� ��������src���Ŀ¼
				
				System.out.println(src.getAbsolutePath());  // D:\workspace\IO\IO.jpg
				
				// ����һ�������ڵ��ļ�
				src = new File("aaa/IO2.jpg");
				System.out.println(src.getAbsolutePath()); // D:\workspace\IO\aaa\IO2.jpg
				
				/*
				 * File ������Թ���һ���ļ� Ҳ���Թ���һ�������ڵ��ļ� ��������·���ı�ʾ��ʽ
				 * 
				 * */				
				
		}
		
}