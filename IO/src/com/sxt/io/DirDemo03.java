package com.sxt.io;

import java.awt.event.PaintEvent;

import javax.swing.Painter;

// �ݹ�
/*
 * �ݹ�ͷ: ��ʱ�����ݹ�
 * �ݹ��壺 ��ʱ�ظ�����
 * 
 * */

public class DirDemo03 {
		
		public static void main(String[] args) {
				printTen(1);
		}
		
		public static void printTen(int n) {
				if (n > 10) {
						return;
				}
				
				System.out.println(n);
				
				printTen(n+1);
		}
		
}
