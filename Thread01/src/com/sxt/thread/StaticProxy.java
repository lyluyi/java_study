package com.sxt.thread;

import org.omg.CORBA.PUBLIC_MEMBER;

// 静态代理

/*
 * 
 * 接口
 * 公共接口 
 * 1、真实角色
 * 
 * 2、代理角色
 * 
 * */

public class StaticProxy {
		public static void main(String[] args) {
				new WeddingCompany(new You()).happyMarry(); // 代理角色（真实角色）.happyMarry()
				
//				new Thread(线程对象).start();
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

// 代理角色
class WeddingCompany implements Marry {

		// 真是角色
		private Marry target;
		
		
		public WeddingCompany(Marry target) { // 添加构造器  传入真实角色
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