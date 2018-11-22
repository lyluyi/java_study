package com.sxt.commons;

import java.util.*;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

/**
 * 
  *  	��ȡ�ļ�
 * 
 * 
 * 
 * */
public class CIOTest03 {
		public static void main(String[] args) throws IOException {
				// ��ȡ�ļ�
				String msg = FileUtils.readFileToString(new File("src/com/sxt/commons/CIOTest01.java"), "GBK");
				
				System.out.println(msg);
				
				byte[] datas = FileUtils.readFileToByteArray(new File("src/com/sxt/commons/CIOTest01.java"));
				
				System.out.println(datas.length);
				
				List<String> msgs = FileUtils.readLines(new File("src/com/sxt/commons/CIOTest01.java"), "GBK");  // һ��һ�ж�ȡ
				
				for (String string : msgs) {
						System.out.println("********************");
						System.out.println(string);
				}
				
				// ������
				LineIterator it = FileUtils.lineIterator(new File("src/com/sxt/commons/CIOTest01.java"), "GBK");
				
				while (it.hasNext()) {
						System.out.println(it.nextLine());
				}
		}
}