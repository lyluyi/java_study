package cn.sxt.oo2;

// ���Է�װ  ���ʿ��Ʒ�

public class TestEncapsulation {
	public static void main(String[] args) {
		Human h = new Human();
//		h.age = 13;
//		h.name = "aaa";
			h.heigth = 170;
			h.name = "aaa";
			
			Person4Encapsulation p4 = new Person4Encapsulation();
//			p4.age = 18; //  �޷�ֱ�ӷ���˽��private������
			p4.setAge(-14); // ͨ��������¶����public���� �����л�ȡ˽�е�����ֵ
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
//		System.out.println(age); // ʹ��privateʱ  ����Ҳ�޷����ʸ��������
	}
}