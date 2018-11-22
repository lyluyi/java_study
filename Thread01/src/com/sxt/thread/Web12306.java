package com.sxt.thread;

/**
 * 
 * 共享资源
 * 
 * @author Administrator
 *
 */

public class Web12306 implements Runnable{
		// 票数
		private int ticketNums = 99;
		
		@Override
		public void run () {
				while (true) {
						if (ticketNums < 0) {
								break;
						}
						
						try {
								Thread.sleep(200); // 模拟网络延迟的情况下 并发的时候  会有a-->-1  c-->-2的输出异常 数据的准确性出现了问题
								// 网络购票 同一个资源 可能存在多个用户去争夺资源 在网络延迟的情况下 并发的时候 如果保证数据准确性就显得很重要
						} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
						} 
						
						// Thread.urrentThread().getName() 当前线程的name 
						System.out.println(Thread.currentThread().getName() + "-->" + ticketNums--);
				}
		}
		
		public static void main(String[] args) {
				
				// 当一份资源有多个代理操作的情况下 即使并发问题。（此时要保证线程安全，即数据的准确性。）
				
				// 一份资源
				Web12306 web = new Web12306();
				System.out.println(Thread.currentThread().getName()); // 这里的线程是main方法 
				// 多个代理
				/*
				 *  构造器中可传入 线程的name
				 * 
				 *  public Thread(Runnable target, String name) {
        			init(null, target, name, 0);
    				}
				 * */
				new Thread(web, "a").start();
				new Thread(web, "b").start();
				new Thread(web, "c").start();
				
				
		}
}
