package com.sxt.io;

import java.io.File;
import java.io.IOException;

/*
 * ������Ϣ��
 * createNewFile() // �����ļ�  �����ڲŴ��� 
 * 
 * delete() // ɾ���Ѵ��ڵ��ļ�
 * 
 * **/

public class FileDemo06 {
		
		public static void main(String[] args) throws IOException {
				File src = new File("D:/workspace/IO/src/IO.txt");
				src.createNewFile();
				boolean flag = src.createNewFile();
				System.out.println(flag); // false �Ѿ������� ����Ϊfalse
				
				// ���ܴ����ļ���
				
				src = new File("D:/workspace/aaa");
				flag = src.createNewFile(); // �����˿յ� û�к�׺��aaa���ļ� �������ļ���
				System.out.println(flag); // ��һ�� ������aaa�����д��� true 
				
				flag = src.delete();
				System.out.println(flag); // true
				
				// ���䣺����ϵͳ���豸�� ���ܴ��� com con �ȵ�
								
		}

}