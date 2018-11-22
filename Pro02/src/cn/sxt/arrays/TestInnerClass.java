package cn.sxt.arrays;

// 测试非静态内部类

public class TestInnerClass {
	public static void main(String[] args) {
		// 创建内部类
			Outer outer = new Outer();
//      Outer.Inner inner = outer.new Inner();  //必须通过Outter对象来创建
			
	}
}

class Outer {
	private int age = 10;
	
	public void testOter() {
		class Inner { // 方法里面的类 非静态内部类
			private int age = 20;
			public void show() {
				int age = 30;
				System.out.println("外部类的成员变量age：" + Outer.this.age);
				System.out.println("内部类的成员变量age：" + this.age);
				System.out.println("内部类的局部变量age：" + age);
			}
		}
	}
}
