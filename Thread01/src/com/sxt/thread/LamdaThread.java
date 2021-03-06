package com.sxt.thread;

/**
 *   Lambda 表达式 简化线程（用一次）的使用
 * @author Administrator
 *
 */

public class LamdaThread  {
		
		// 静态内部类
		static class test implements Runnable {

				@Override
				public void run () {
						for (int i = 0; i < 20; i++) {
								System.out.println("一边听歌" + i);
						}
				}
				
		}
		
		/**
		 * 
		 * 线程入口点
		 * 
		 * */
		
		
		
		public static void main(String[] args) {
				
				// 局部内部类
				class test2 implements Runnable {

						@Override
						public void run () {
								for (int i = 0; i < 20; i++) {
										System.out.println("一边听歌" + i);
								}
						}
				}
				
				new Thread(new test2()).start();
				
//				//匿名内部类 必须借助接口或者父类
//				new Thread(new Runnable() {
//						
//						@Override
//						public void run() {
//								// TODO Auto-generated method stub
//								
//						}
//				});
				
				// jdk8 简化 lambda
				new Thread(	()-> {
						for (int i = 0; i < 20; i++) {
								System.out.println("一边听歌" + i);
						}
				});
		}
}


