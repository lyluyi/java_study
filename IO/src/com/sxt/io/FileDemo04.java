package com.sxt.io;

import java.io.File;

/*
 * 文件的状态
 * 
 * 1、是否存在 ： exits
 * 2、是否是文件：isFile（）
 * 3、是否是文件夹 isDirectory（） 是否是文件夹
 * 
 * */

public class FileDemo04 {

		public static void main(String[] args) {
				
				File src = new File("D:/workspace/IO/src/IO.jpg");
				
				System.out.println(src.getAbsolutePath());  // D:\workspace\IO\src\IO.jpg
				System.out.println("是否存在：" + src.exists()); // 是否存在：true
				System.out.println("是否是文件：" + src.isFile()); // 是否是文件：true
				System.out.println("是否是文件夹：" + src.isDirectory()); // 是否是文件夹 ：false
				
				src = new File("IO.jpg");
//				src = new File("src/IO.jpg");  用这个结果又是正确的
				System.out.println(src.getAbsolutePath()); // D:\workspace\IO\IO.jpg  ??? 这里为什么多了一个IO
				System.out.println("是否存在：" + src.exists()); // 是否存在：false
				System.out.println("是否是文件：" + src.isFile()); // 是否是文件：false
				System.out.println("是否是文件夹" + src.isDirectory()); // 是否是文件夹false
				
		}
}
