package cn.sxt.oo2;

public class TestObject {
	public static void main(String[] args) {
//		Object obj;
			TestObject to = new TestObject();
			System.out.println(to.toString());
			
			Person2 p2 = new Person2("AAA", 18); // ����ʵ����
			System.out.println(p2.toString());
	}
	
	public String toString() {
		return "aaaa"; // ��д��toString
	}
}

class Person2 {
	String name;
	int age;
	
	@Override
	
	public String toString () { // ��дtoString
		return name + "����" + age;
	}
	
	public  Person2(String name, int age) { // ������
		this.name = name;
		this.age = age;
	}
}