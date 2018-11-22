package com.sxt.io;

import java.io.File;

/*
 * �ļ���״̬
 * 
 * 1���Ƿ���� �� exits
 * 2���Ƿ����ļ���isFile����
 * 3���Ƿ����ļ��� isDirectory���� �Ƿ����ļ���
 * 
 * */

public class FileDemo04 {

		public static void main(String[] args) {
				
				File src = new File("D:/workspace/IO/src/IO.jpg");
				
				System.out.println(src.getAbsolutePath());  // D:\workspace\IO\src\IO.jpg
				System.out.println("�Ƿ���ڣ�" + src.exists()); // �Ƿ���ڣ�true
				System.out.println("�Ƿ����ļ���" + src.isFile()); // �Ƿ����ļ���true
				System.out.println("�Ƿ����ļ��У�" + src.isDirectory()); // �Ƿ����ļ��� ��false
				
				src = new File("IO.jpg");
//				src = new File("src/IO.jpg");  ��������������ȷ��
				System.out.println(src.getAbsolutePath()); // D:\workspace\IO\IO.jpg  ??? ����Ϊʲô����һ��IO
				System.out.println("�Ƿ���ڣ�" + src.exists()); // �Ƿ���ڣ�false
				System.out.println("�Ƿ����ļ���" + src.isFile()); // �Ƿ����ļ���false
				System.out.println("�Ƿ����ļ���" + src.isDirectory()); // �Ƿ����ļ���false
				
		}
}