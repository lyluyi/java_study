package com.sxt.io;

import java.io.File;

// 相对路径 绝对路径

public class FileDemo02 {

		public static void main(String[] args) {
				
				/*
				 * 构建File对象
				 *  
				 * 相对路径(不存在盘符) 相对于user.dir 即工程目录
				 * 
				 * 绝对路径(有盘符)
				 * 
				 **/
				
				String path = "D:/workspace/IO/src/IO.jpg"; 
				
				// 绝对路径
				File src = new File(path);
				
				System.out.println(src.getAbsolutePath()); // D:\workspace\IO\src\IO.jpg
				
       // 相对路径
				System.out.println(System.getProperty("user.dir")); // D:\workspace\IO 获取工程目录
				
				src = new File("IO.jpg");
				
				//	getAbsolutePath得到的是全路径。如果构造参数是相对路径，
				// 则返回当前目录的绝对路径+构造参数路径；如果是绝对路径则直接返回
				// // D:\workspace\IO 只能到工程目录下 但是少了src这个目录
				
				System.out.println(src.getAbsolutePath());  // D:\workspace\IO\IO.jpg
				
				// 构建一个不存在的文件
				src = new File("aaa/IO2.jpg");
				System.out.println(src.getAbsolutePath()); // D:\workspace\IO\aaa\IO2.jpg
				
				/*
				 * File 对象可以构建一个文件 也可以构建一个不存在的文件 即本质是路径的表示形式
				 * 
				 * */				
				
		}
		
}
