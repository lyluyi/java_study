package cn.sxt.oop.adstractClass;

// ������  ���abtract ���������д����ķ���
public abstract class Animal {
	public void run() {
		
	}
}

class Cat extends Animal {
	
	@Override
	public void run() {
		System.out.println("aaaa" );
	}
}
