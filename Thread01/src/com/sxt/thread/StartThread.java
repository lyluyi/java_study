package com.sxt.thread;

/**
 *   �����̵߳ķ�ʽ
 * 
 * 1�� �������̳�Thread + ��дrun����
 * 
 * 2�� ����������������� + ����start����
 * @author Administrator
 *
 */

public class StartThread extends Thread {
		
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
				
				// �����������
				StartThread st = new StartThread();
				
				// ����start��������
				st.start(); // ��ԭ���߳�����main�����Ļ����� ����һ���߳�Ҳ����  ����֤�������� ��cpu����
//				st.run(); // ˳��ִ��
				
				for (int i = 0; i < 20; i++) {
						System.out.println("һ��coding" + i);
				}
				
				// ÿ�����еĽ����һ��
		}
}

