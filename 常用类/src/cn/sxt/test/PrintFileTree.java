package cn.sxt.test;

import java.io.File;

// 使用递归算法打印目录树

public class PrintFileTree {
	public static void main(String[] args) {
		File f = new File("D:\\1_pdf");
		
		printFile(f, 0);
	
	}
	
	static void printFile(File file, int level) {
			
			// 输出level 
		for (int i = 0; i < level; i++) {
				System.out.print("---");
		}
			
		System.out.println(file.getName());
		if (file.isDirectory()) { // 为文件夹目录
			File[] filse = file.listFiles(); // 子目录集合
			
			for (File temp:filse) {
				printFile(temp, level + 1);
			}
		}
	}
}
