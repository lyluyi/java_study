package com.sxt.io;

import java.io.File;

public class FileDemo01 {
		
		public static void main(String[] args) {
				
				/*
				 * 构建File对象
				 * 
				 * 
				 * */
				
				String path = "D:/workspace/IO/src/IO.jpg";
				
				// 构建的File对象的方式
				
        // 1、	直接进行路径构建			
				File src = new File(path);
				System.out.println(src.length()); // 87247 文件的大小
				
				// 2、 父子构建
				src =  new File("D:/workspace/IO/src", "IO.jpg");
				System.out.println(src); // D:\workspace\IO\src\IO.jpg
				
				// 3、父对象 子名称
				src = new File(new File("D:/workspace/IO/src"), "IO.jpg");
				System.out.println(src); // D:\workspace\IO\src\IO.jpg
				
		}

}
