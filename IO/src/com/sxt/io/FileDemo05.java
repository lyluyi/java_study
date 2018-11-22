package com.sxt.io;

import java.io.File;

/*
 * 其它信息：
 * length（） 字节数
 * 
 * 
 * **/

public class FileDemo05 {
		
		public static void main(String[] args) {
				File src = new File("D:/workspace/IO/src/IO.jpg");
				
				System.out.println(src.length());
				
		}

}
