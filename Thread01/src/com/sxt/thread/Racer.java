package com.sxt.thread;

/*
 * 
 * ģ���������
 * 
 * 
 * 
 * 
 */

public class Racer implements Runnable{
		
		private static String winner; // ʤ����
		
		@Override
		public void run() {
				for (int steps = 1; steps <= 100; steps++) {
						if (Thread.currentThread().getName().equals("����") && steps%10 == 0) { // ÿ10�� ˯��
								try {
										Thread.sleep(100);
								} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
								}
						}
						System.out.println(Thread.currentThread().getName() + "-->" + steps);
						boolean flag = gameOver(steps);
						if (flag) {
								break;
						}
						
				}
		}
		
		public boolean gameOver(int steps) {
				if (winner!= null) { // ����ʤ��
						return true;
				} else {
						if (steps == 100) {
								
								winner = Thread.currentThread().getName();
								System.out.println("winner==>" + winner);
								return true;
						}
				}
				return false;
		}
		
		public static void main(String[] args) {
				Racer racer = new Racer();
				new Thread(racer, "�ڹ�").start();
				new Thread(racer, "����").start();
		}
}