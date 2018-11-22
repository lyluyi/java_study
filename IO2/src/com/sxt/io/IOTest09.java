package com.sxt.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.imageio.ImageTypeSpecifier;

/*
 * 
 * 1、将图片读取到字节数组中
 * 2、字节数据写出道文件 FileInputStream
 * 3、程序到字节数组 ByteArrayOutputStream
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

public class IOTest09 {

		public static void main(String[] args) {
				
				// 图片转为字节数组流
				byte[] datas =fileToByteArray("IO.jpg"); 
				System.out.println(datas.length);
				
				// 字节数组流转为图片
				byteArrayToFile(datas,"IO_Copy.jpg");
		}
		
		/*
		 * 1、图片读取到字节数据
		 * 2、图片到程序 FileInputStream
		 * 3、程序到字节数组 ByteArrayOutputStream
		 * 
		 * */ 
		public static byte[] fileToByteArray(String filePath) {
				
				// 1、创建源
				File src = new File(filePath); // 源
				byte[] dest = null; // 目的地
				
				InputStream is = null;
				ByteArrayOutputStream baos = null;
				
				// 2、选择流
				try {
						
						is = new FileInputStream(src);
						baos = new ByteArrayOutputStream();
						// 3、读取（操作）
						byte[] flush = new byte[1024*10]; // 缓冲容器 1k
						int len = -1; // 接收长度
						while ((len =is.read(flush)) != -1) { // 每三个读取一次
								
								baos.write(flush,0,flush.length);
								
						}
						
						baos.flush();
						return baos.toByteArray();
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
				return null;
}
		
		/*
		 * 
		 * 1、字节数组写出到图片
		 * 2、字节数组到程序 ByteArrayInputStream
		 * 3、程序到文件 FileOutput
		 * 
		 * **/ 
		public static void byteArrayToFile(byte[] src, String filePath) {
				// 1、创建源  字节流数组
				File dest = new File(filePath);
				
				// 2、选择流
				InputStream is = null;
				OutputStream os = null;
				try {
						is = new ByteArrayInputStream(src);
						os = new FileOutputStream(dest);
						
						// 3、读取（操作）
						byte[] flush = new byte[5]; // 缓冲容器 1k
						int len = -1; // 接收长度
						while ((len =is.read(flush)) != -1) { // 每三个读取一次
								os.write(flush, 0, flush.length);
								
						}
				} catch (FileNotFoundException e) {
						e.printStackTrace();
				} catch (IOException e) {
						e.printStackTrace();
				} finally {
						try {
								if (null!= os) {
										os.close();
								}
								
						} catch (IOException e) {
								e.printStackTrace();
						}
				}
				
				
		}
}
