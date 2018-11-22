package com.sxt.io;

import java.io.File;

/*
 * 
 * 创建目录
 * 
 * 1、 mkdir（） ： 确保上级目录存在， 不存在则创建失败
 * 2、mkdirs（）： 上级目录可以不存在，不存在则一同创建
 * 
 * 
 * */

public class DirDemo01 {

		public static void main(String[] args) {
				
				File dir = new File("D:/workspace/IO/dir/test");
				
				// 创建目录
				boolean flag = dir.mkdirs(); // 一般使用mkdirs 
				System.out.println(flag); // 创建成功时为true
				
				// 目录已经存在
				dir = new File("D:/workspace/IO/dir/test1");
				flag = dir.mkdir(); // 一般使用mkdirs 
				System.out.println(flag); // true
		}
}
