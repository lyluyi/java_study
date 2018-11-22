package com.sxt.io;

import java.io.File;

/*
 * �г���һ��
 * 
 * 1�� list() �г���һ������
 * 2�� listFile() �г��¼�File����
 * 
 * 
 * **/

public class DirDemo02 {
		public static void main(String[] args) {
				
				File dir = new File("D:/workspace/IO");
				
				// �г��¼�����list ���ﷵ�ص���String �ַ������� ������
				String[] subNames = dir.list();
				for (int i = 0; i < subNames.length; i++) {
						System.out.println(subNames[i]);
						/*
						 * .classpath
                .project
                .settings
                bin
                dir
                src
                src1
						 * 
						 * */			
						
				}
				
				// �г��¼����� listFiles ���ﷵ�ص�File ����
				File[] subFlies = dir.listFiles();
				// ����dir.listFiles(); ���صĶ���Fileʵ���� ���Բ�����String���[] ȥ����
				
				for(File s: subFlies) {
						System.out.println(s);
						
						/*
						 * D:\workspace\IO\.classpath
               D:\workspace\IO\.project
               D:\workspace\IO\.settings
               D:\workspace\IO\bin
               D:\workspace\IO\dir
               D:\workspace\IO\src
               D:\workspace\IO\src1
						 * 
						 * 
						 * **/
				}
				
				
				
				
				
		}
}
