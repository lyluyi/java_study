package cn.sxt.oo2;

// 测试封装  访问控制符

public class TestEncapsulation {
	public static void main(String[] args) {
		Human h = new Human();
//		h.age = 13;
//		h.name = "aaa";
			h.heigth = 170;
			h.name = "aaa";
			
			Person4Encapsulation p4 = new Person4Encapsulation();
//			p4.age = 18; //  无法直接访问私有private的属性
			p4.setAge(-14); // 通过自身暴露出的public方法 来进行获取私有的属性值
//			p4.setName("aaa");
			p4.getName();
	}
}

//class Human {
//	private int age;
//	String name;
//	
//	void sayAge () {
//		System.out.println(age);
//	}
//}
//
class Boy extends Human {
	void sayHello () {
//		System.out.println(age); // 使用private时  子类也无法访问父类的属性
	}
}
