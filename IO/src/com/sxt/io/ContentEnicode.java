package com.sxt.io;

import java.io.UnsupportedEncodingException;

// 编码 字符串 字节

public class ContentEnicode {
		
		public static void main(String[] args) throws UnsupportedEncodingException {
				
				String msg = "性命使命生命";
				
				// 编码 字节数组
				
				byte[] datas = msg.getBytes(); // 默认使用工程的字符集GBK UTF-8 是一个中文字符占三个字节
				
				System.out.println(datas.length); // 18
				
				// 编码 其它字符集
				datas = msg.getBytes("UTF-16LE");
				System.out.println(datas.length); // 12 中文两个字节 英文一个字节
		}
}