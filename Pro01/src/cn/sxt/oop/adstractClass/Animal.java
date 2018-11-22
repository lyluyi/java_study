package cn.sxt.oop.adstractClass;

// 抽象类  添加abtract 子类必须重写父类的方法
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
