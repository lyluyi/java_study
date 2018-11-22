package com.sxt.thread;

/**
 *   创建线程的方式二
 * 
 * 1、 创建：实现runnable 重写 run
 * 
 * 2、 启动：创建实现类对象 + Thread对象 + start
 * 
 * 避免单继承的局限性 优先使用接口
 * @author Administrator
 *
 */

public class StartRun implements Runnable {
		
		/**
		 * 
		 * 线程入口点
		 * 
		 * */
		
		@Override
		public void run () {
				for (int i = 0; i < 20; i++) {
						System.out.println("一边听歌" + i);
				}
		}
		
		public static void main(String[] args) {
				
				// 创建实现类对象
				StartRun sr = new StartRun();

				// 创建代理对象
				Thread t = new Thread(sr);
				
				// 调用start方法启动
				t.start(); // 在原来线程运行main方法的基础上 开启一个线程也在跑  不保证立即运行 由cpu调用
//				t.run(); // 顺序执行
				
//				new Thread(new StartRun()).start(); // 使用匿名对象 因为都使用了一次
				
				for (int i = 0; i < 20; i++) {
						System.out.println("一遍coding" + i);
				}
				
				// 每次运行的结果不一样
		}
}


