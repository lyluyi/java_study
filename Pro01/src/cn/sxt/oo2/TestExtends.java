package cn.sxt.oo2;

// 测试继承

public class TestExtends {
	public static void main(String[] args) {
		Student stu = new Student(); // 空的构造器
		stu.name = "aaa";
		stu.height = 172;
		stu.reset();
		Student stu2 = new Student("bbb", 123, "ccc");
		System.out.println(stu instanceof Student);
		System.out.println(stu instanceof Person);
		System.out.println(stu instanceof Object);
	}
}

class Person {
	String name;
	int height;
	
	public void reset() {
		System.out.println("休息一会!");
	}
}

class Student extends Person {
	String major;
	
	public void study() {
		System.out.println("study!");
	}
	public Student(String name, int height, String major) { // 带参数的构造器 
		this.name = name;
		this.height = height;
		this.major = major;
	}
	
	public Student() {
			
	}
}