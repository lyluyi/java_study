package com.sxt.thread;

/**
 *   Lambda ����ʽ ���̣߳���һ�Σ���ʹ��
 * @author Administrator
 *
 */

public class LamdaThread  {
		
		// ��̬�ڲ���
		static class test implements Runnable {

				@Override
				public void run () {
						for (int i = 0; i < 20; i++) {
								System.out.println("һ������" + i);
						}
				}
				
		}
		
		/**
		 * 
		 * �߳���ڵ�
		 * 
		 * */
		
		
		
		public static void main(String[] args) {
				
				// �ֲ��ڲ���
				class test2 implements Runnable {

						@Override
						public void run () {
								for (int i = 0; i < 20; i++) {
										System.out.println("һ������" + i);
								}
						}
				}
				
				new Thread(new test2()).start();
				
//				//�����ڲ��� ��������ӿڻ��߸���
//				new Thread(new Runnable() {
//						
//						@Override
//						public void run() {
//								// TODO Auto-generated method stub
//								
//						}
//				});
				
				// jdk8 �� lambda
				new Thread(	()-> {
						for (int i = 0; i < 20; i++) {
								System.out.println("һ������" + i);
						}
				});
		}
}

