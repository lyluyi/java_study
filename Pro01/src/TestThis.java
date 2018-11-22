//  this 对象 重载

public class TestThis {
	int a,b,c; // 成员变量 abc
	
	TestThis(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	TestThis(int a, int b, int c) { // 重载了一次 TestThis 方法
		this(a, b); // 使用this关键字调用重载的构造方法  必须放在构造方法中的第一句   
		this.c = c;
 	}
	
	void sing() {
			
	}
	
	void eat() {
		this.sing();
		System.out.println("aaaaa111");
	}
	
	public static void main(String[] args) {
		TestThis hi = new TestThis(2, 3);
		hi.eat();
	}
}
