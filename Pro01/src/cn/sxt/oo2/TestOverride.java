package cn.sxt.oo2;

// ��д ����̳и���  ������ķ�����д 

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
	
	public Person whoIsPsg() { // ������cn.sxt.oo2 ����Person�� ����д�뷽��
		return new Person();
	}
}

class Horse extends Vehicle {
	public void run() {
		System.out.println("run run");
	}
	
	public Person whoIsPsg() { // ����ֵ����С�ڵ��ڸ��� Person�ǵ��� ��public Object whoIsPsg���Ǵ��� 
		return new Student();
	}
}