package com.sxt.commons;

import java.io.File;

import org.apache.commons.io.FileUtils;

/**
 * 
  * ͳ�� �ļ� Ŀ¼ ��С
 * 
 * 
 * 
 * */
public class CIOTest01 {
		public static void main(String[] args) {
				// �ļ���С
				long len = FileUtils.sizeOf(new File("src/com/sxt/commons/CIOTest01.java"));
				
				System.out.println(len);
				
				// Ŀ¼��С
				len =  FileUtils.sizeOf(new File("D:/workspace/IO3"));
				
				System.out.println(len);
		}
}