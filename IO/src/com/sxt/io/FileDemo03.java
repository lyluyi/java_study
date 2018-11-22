package com.sxt.io;

import java.io.File;

/*
 * ���ƻ�·��
 * 
 * getName()
 * getPath() // ����� ������� ���Ծͷ��ؾ���
 * getParent() // ��ȡ��һ�� 
 * 
 * */

public class FileDemo03 {
		
		public static void main(String[] args) {
				
				File src = new File("IO.jpg");
				
				System.out.println("���ƣ�" + src.getName());  // IO.jpg
				System.out.println("·����" + src.getPath());  // D:\workspace\IO\src\IO.jpg  �������·��
				System.out.println("��·����" + src.getParent()); // null ����ʱû�� IO.jpg
				
		}
		
}