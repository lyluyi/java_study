package com.sxt.thread;

/**
 * 
 * ������Դ
 * 
 * @author Administrator
 *
 */

public class Web12306 implements Runnable{
		// Ʊ��
		private int ticketNums = 99;
		
		@Override
		public void run () {
				while (true) {
						if (ticketNums < 0) {
								break;
						}
						
						try {
								Thread.sleep(200); // ģ�������ӳٵ������ ������ʱ��  ����a-->-1  c-->-2������쳣 ���ݵ�׼ȷ�Գ���������
								// ���繺Ʊ ͬһ����Դ ���ܴ��ڶ���û�ȥ������Դ �������ӳٵ������ ������ʱ�� �����֤����׼ȷ�Ծ��Եú���Ҫ
						} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
						} 
						
						// Thread.urrentThread().getName() ��ǰ�̵߳�name 
						System.out.println(Thread.currentThread().getName() + "-->" + ticketNums--);
				}
		}
		
		public static void main(String[] args) {
				
				// ��һ����Դ�ж���������������� ��ʹ�������⡣����ʱҪ��֤�̰߳�ȫ�������ݵ�׼ȷ�ԡ���
				
				// һ����Դ
				Web12306 web = new Web12306();
				System.out.println(Thread.currentThread().getName()); // ������߳���main���� 
				// �������
				/*
				 *  �������пɴ��� �̵߳�name
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
