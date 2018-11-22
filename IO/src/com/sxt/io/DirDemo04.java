package com.sxt.io;

import java.io.File;

/*
 * 使用递归
 * 
 * 打印下级目录
 * 
 * */

public class DirDemo04 {
		public static void main(String[] args) {
				
				File src = new File("D:/test");
				
				// 打印子孙级目录的名称
				printName(src, 0);
				
		}
		
		public static void printName(File src, int deep) {
				for (int i = 0; i < deep; i++) {
						System.out.print("-");
				}
				
				System.out.println(src.getName());
				
				if (null == src || !src.exists()) { // 是否存在  递归头
						return;
				} else if (src.isDirectory()) { // 是否为目录 递归体
						
						// 循环输出 的先后 是先进行目录级别的遍历 如果当前目录下面有子目录 那么输出子目录循环
						
						// 即先遍历外层 有外层有内层即进入内层遍历 内层遍历优先级高
						for (File s : src.listFiles()) {  
								printName(s, deep + 1);
						}
				}
		}
}

