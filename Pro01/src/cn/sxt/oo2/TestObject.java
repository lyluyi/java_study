package cn.sxt.oo2;

public class TestObject {
	public static void main(String[] args) {
//		Object obj;
			TestObject to = new TestObject();
			System.out.println(to.toString());
			
			Person2 p2 = new Person2("AAA", 18); // 生成实例类
			System.out.println(p2.toString());
	}
	
	public String toString() {
		return "aaaa"; // 重写了toString
	}
}

class Person2 {
	String name;
	int age;
	
	@Override
	
	public String toString () { // 重写toString
		return name + "年龄" + age;
	}
	
	public  Person2(String name, int age) { // 构造器
		this.name = name;
		this.age = age;
	}
}