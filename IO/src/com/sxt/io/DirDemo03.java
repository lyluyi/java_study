package com.sxt.io;

import java.awt.event.PaintEvent;

import javax.swing.Painter;

// 递归
/*
 * 递归头: 何时结束递归
 * 递归体： 何时重复调用
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
