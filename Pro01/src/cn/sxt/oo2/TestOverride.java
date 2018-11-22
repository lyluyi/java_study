package cn.sxt.oo2;

// 重写 子类继承父类  将父类的方法重写 

public class TestOverride {
	public static void main(String[] args) {
		Horse h = new Horse();
		h.run();
	}
}

class Vehicle {
	public void run() {
		System.out.println("run");
	}
	
	public void stop() {
		System.out.println("stop");
	}
	
	public Person whoIsPsg() { // 调用了cn.sxt.oo2 包里Person类 并且写入方法
		return new Person();
	}
}

class Horse extends Vehicle {
	public void run() {
		System.out.println("run run");
	}
	
	public Person whoIsPsg() { // 返回值类型小于等于父类 Person是等于 用public Object whoIsPsg就是大于 
		return new Student();
	}
}