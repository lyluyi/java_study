package com.sxt.io;

import java.io.File;

/*
 * ͳ���ļ��д�С
 * 
 * ��ӡ�¼�Ŀ¼
 * 
 * */

public class DirDemo05 {
		public static void main(String[] args) {
				
				File src = new File("D:/workspace/IO");
				
				// ��ȡ�����ļ��ֽ����ݴ�С
				count(src);
				System.out.println(len); // 196660  196,670 
				
		}
		
		// ����ΪʲôҪ����static
		private static long len = 0;
		
		public static void count(File src) {
				
				if (src !=null && src.exists()) {
						
						if (src.isFile()) { // ��ȡ��С
								len += src.length();
						} else { // �¼�Ŀ¼
								for (File s : src.listFiles()) {
										count(s);
								}
						}
				}
				
		}
}
