package cn.sxt.test;

import java.io.File;

// ʹ�õݹ��㷨��ӡĿ¼��

public class PrintFileTree {
	public static void main(String[] args) {
		File f = new File("D:\\1_pdf");
		
		printFile(f, 0);
	
	}
	
	static void printFile(File file, int level) {
			
			// ���level 
		for (int i = 0; i < level; i++) {
				System.out.print("---");
		}
			
		System.out.println(file.getName());
		if (file.isDirectory()) { // Ϊ�ļ���Ŀ¼
			File[] filse = file.listFiles(); // ��Ŀ¼����
			
			for (File temp:filse) {
				printFile(temp, level + 1);
			}
		}
	}
}
