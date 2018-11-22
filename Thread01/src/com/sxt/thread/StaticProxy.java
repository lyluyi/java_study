package com.sxt.thread;

import org.omg.CORBA.PUBLIC_MEMBER;

// ��̬����

/*
 * 
 * �ӿ�
 * �����ӿ� 
 * 1����ʵ��ɫ
 * 
 * 2��������ɫ
 * 
 * */

public class StaticProxy {
		public static void main(String[] args) {
				new WeddingCompany(new You()).happyMarry(); // ������ɫ����ʵ��ɫ��.happyMarry()
				
//				new Thread(�̶߳���).start();
		}
}

interface Marry {
		void happyMarry();
}

class You implements Marry {
		
		@Override
		public void happyMarry() {
				System.out.println("you Marry!");
		}
		
}

// ������ɫ
class WeddingCompany implements Marry {

		// ���ǽ�ɫ
		private Marry target;
		
		
		public WeddingCompany(Marry target) { // ���ӹ�����  ������ʵ��ɫ
				super();
				this.target = target;
		}


		@Override
		public void happyMarry() {
				ready();
				
				this.target.happyMarry();
				
				after();
		}
		
		private void ready() {
				System.out.println("ready");
		}
		
		private void after() {
				System.out.println("papapa!");
		}
		
}