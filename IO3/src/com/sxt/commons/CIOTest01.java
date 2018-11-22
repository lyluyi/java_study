package com.sxt.commons;

import java.io.File;

import org.apache.commons.io.FileUtils;

/**
 * 
  * 统计 文件 目录 大小
 * 
 * 
 * 
 * */
public class CIOTest01 {
		public static void main(String[] args) {
				// 文件大小
				long len = FileUtils.sizeOf(new File("src/com/sxt/commons/CIOTest01.java"));
				
				System.out.println(len);
				
				// 目录大小
				len =  FileUtils.sizeOf(new File("D:/workspace/IO3"));
				
				System.out.println(len);
		}
}
