package com.sxt.io;

import java.io.File;

/*
 * 统计文件夹大小
 * 
 * 打印下级目录
 * 
 * */

public class DirDemo05 {
		public static void main(String[] args) {
				
				File src = new File("D:/workspace/IO");
				
				// 获取所有文件字节内容大小
				count(src);
				System.out.println(len); // 196660  196,670 
				
		}
		
		// 这里为什么要声明static
		private static long len = 0;
		
		public static void count(File src) {
				
				if (src !=null && src.exists()) {
						
						if (src.isFile()) { // 获取大小
								len += src.length();
						} else { // 下级目录
								for (File s : src.listFiles()) {
										count(s);
								}
						}
				}
				
		}
}

