package com.sxt.thread;

/**
 *   �����̵߳ķ�ʽ��
 * 
 * 1�� ������ʵ��runnable ��д run
 * 
 * 2�� ����������ʵ������� + Thread���� + start
 * 
 * ���ⵥ�̳еľ����� ����ʹ�ýӿ�
 * @author Administrator
 *
 */

public class StartRun implements Runnable {
		
		/**
		 * 
		 * �߳���ڵ�
		 * 
		 * */
		
		@Override
		public void run () {
				for (int i = 0; i < 20; i++) {
						System.out.println("һ������" + i);
				}
		}
		
		public static void main(String[] args) {
				
				// ����ʵ�������
				StartRun sr = new StartRun();

				// ������������
				Thread t = new Thread(sr);
				
				// ����start��������
				t.start(); // ��ԭ���߳�����main�����Ļ����� ����һ���߳�Ҳ����  ����֤�������� ��cpu����
//				t.run(); // ˳��ִ��
				
//				new Thread(new StartRun()).start(); // ʹ���������� ��Ϊ��ʹ����һ��
				
				for (int i = 0; i < 20; i++) {
						System.out.println("һ��coding" + i);
				}
				
				// ÿ�����еĽ����һ��
		}
}

