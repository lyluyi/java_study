package com.sxt.io;

import java.io.File;

public class FileDemo01 {
		
		public static void main(String[] args) {
				
				/*
				 * ����File����
				 * 
				 * 
				 * */
				
				String path = "D:/workspace/IO/src/IO.jpg";
				
				// ������File����ķ�ʽ
				
        // 1��	ֱ�ӽ���·������			
				File src = new File(path);
				System.out.println(src.length()); // 87247 �ļ��Ĵ�С
				
				// 2�� ���ӹ���
				src =  new File("D:/workspace/IO/src", "IO.jpg");
				System.out.println(src); // D:\workspace\IO\src\IO.jpg
				
				// 3�������� ������
				src = new File(new File("D:/workspace/IO/src"), "IO.jpg");
				System.out.println(src); // D:\workspace\IO\src\IO.jpg
				
		}

}
