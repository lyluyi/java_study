package com.sxt.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;import javax.imageio.ImageTypeSpecifier;

/*
 * 理解操作步骤
 * 
 * 1、创建源
 * 2、选择流
 * 3、操作
 * 4、释放资源
 * 
 * */ 

public class IOTest02 {

		public static void main(String[] args) {
				
				// 1、创建源
				File src = new File("abc.txt");
				
				InputStream is = null;
				
				// 2、选择流
				try {
						
						is = new FileInputStream(src);
						
						// 3、读取（操作）
						int temp;
						
						while ((temp=is.read()) != -1) {
								System.out.println((char)temp);
						}
				} catch (FileNotFoundException e) {
						e.printStackTrace();
				} catch (IOException e) {
						e.printStackTrace();
				} finally {
						try {
								if (null!=is) {
										is.close();
								}
								
						} catch (IOException e) {
								e.printStackTrace();
						}
				}
				
		}
}
