package cn.sxt.test;

import java.io.Console;

// 测试StringBuilder  StringBuffer可变字符序列和不可变字符序列使用的注意点

public class TestStringBuilder2 {
	public static void main(String[] args) {
		
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < 26; i++) {
				// char类型是可以运算的因为char在ASCII等字符编码表中有对应的数值。
			 //	 在JAVA中，对char类型字符运行时，直接当做ASCII表对应的整数来对待。	
			// char m='a'+1;　　——b。//提升为int，计算结果98对应的字符是b。
				char temp = (char)('a' + i); 
				sb.append(temp); // 尾部插入
			}
			System.out.println(sb);
			
			sb.reverse(); // 倒序
			System.out.println(sb);
//			sb.setCharAt(3, 'aaaa');  // 报错 lang包中 没有对应的API
			
			sb.insert(0, '我').insert(3, '哈').insert(6, 'a');
			
			System.out.println(sb);
			
			
	}
}
