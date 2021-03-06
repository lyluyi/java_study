package com.sxt.io;

import java.io.File;

// IO 文件流  File类的separator是由separatorChar转换成的  一个是字符串，一个是字符

public class PathDemo01 {
		public static void main(String[] args) {
				/*
				 * 
				 * \ 为名称分隔符  实际就是转义字符 separator
				 * 
				 * */
				
				// separator是由separatorChar转换成的  一个是字符串，一个是字符
				
				String path = "D:\\workspace\\IO\\src\\IO.jpg";
				
				System.out.println(File.separatorChar); // 输出：\ 
				
				// 开发中遇到路径 的写法方式
				
				// 1、
				path = "D:/workspace/IO/src/IO.jpg"; // 将 \\ 全部写成 /
				System.out.println(path); // D:/workspace/IO/src/IO.jpg
				
				// 2 常量拼接
				path = "D:" + File.separator + "workspace" + File.separator + "IO" + File.separator + "src" + File.separator + "IO.jpg";
				
				System.out.println(path); // D:\workspace\IO\src\IO.jpg
				
				// 这两种表示的区别是为什么？ 表示的结果是一致的
				
				
				
		}
}
