package com.sxt.io;

import java.io.File;

/*
 * 
 * ����Ŀ¼
 * 
 * 1�� mkdir���� �� ȷ���ϼ�Ŀ¼���ڣ� �������򴴽�ʧ��
 * 2��mkdirs������ �ϼ�Ŀ¼���Բ����ڣ���������һͬ����
 * 
 * 
 * */

public class DirDemo01 {

		public static void main(String[] args) {
				
				File dir = new File("D:/workspace/IO/dir/test");
				
				// ����Ŀ¼
				boolean flag = dir.mkdirs(); // һ��ʹ��mkdirs 
				System.out.println(flag); // �����ɹ�ʱΪtrue
				
				// Ŀ¼�Ѿ�����
				dir = new File("D:/workspace/IO/dir/test1");
				flag = dir.mkdir(); // һ��ʹ��mkdirs 
				System.out.println(flag); // true
		}
}