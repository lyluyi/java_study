package com.sxt.io;

import java.io.File;

/*
 * 名称或路径
 * 
 * getName()
 * getPath() // 有相对 返回相对 绝对就返回绝对
 * getParent() // 获取上一级 
 * 
 * */

public class FileDemo03 {
		
		public static void main(String[] args) {
				
				File src = new File("IO.jpg");
				
				System.out.println("名称：" + src.getName());  // IO.jpg
				System.out.println("路径：" + src.getPath());  // D:\workspace\IO\src\IO.jpg  返回相对路径
				System.out.println("父路径：" + src.getParent()); // null 构建时没有 IO.jpg
				
		}
		
}
