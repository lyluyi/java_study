package com.sxt.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;import javax.imageio.ImageTypeSpecifier;

/*
 * 
 *  字节数组输出流
 *  
 * 理解操作步骤: 分段读取
 * 
 * 1、创建源
 * 2、选择流
 * 3、操作
 * 4、释放资源
 * 
 * */ 

public class IOTest08 {

		public static void main(String[] args) {
				
				// 1、创建源  字节流数组
				byte[] dest = null;
				
				// 2、选择流
				ByteArrayOutputStream baos = null;
				
				
				try {
						
						baos = new ByteArrayOutputStream();
						
						// 3、读取（操作）
						byte[] flush = new byte[5]; // 缓冲容器 1k
						int len = -1; // 接收长度
								// 字节数组 ---> 字符串解码
								String msg ="aasadasdas";
								byte[] datas = msg.getBytes();
								baos.write(datas,0,datas.length);
								System.out.println(msg); 
								
								// 获取数据
								dest = baos.toByteArray();
								System.out.println(dest.length);
								
				} finally {
						try {
								if (null!=baos) {
										baos.close();
								}
								
						} catch (IOException e) {
								e.printStackTrace();
						}
				}
				
		}
}