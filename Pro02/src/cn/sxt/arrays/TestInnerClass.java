package cn.sxt.arrays;

// ���ԷǾ�̬�ڲ���

public class TestInnerClass {
	public static void main(String[] args) {
		// �����ڲ���
			Outer outer = new Outer();
//      Outer.Inner inner = outer.new Inner();  //����ͨ��Outter����������
			
	}
}

class Outer {
	private int age = 10;
	
	public void testOter() {
		class Inner { // ����������� �Ǿ�̬�ڲ���
			private int age = 20;
			public void show() {
				int age = 30;
				System.out.println("�ⲿ��ĳ�Ա����age��" + Outer.this.age);
				System.out.println("�ڲ���ĳ�Ա����age��" + this.age);
				System.out.println("�ڲ���ľֲ�����age��" + age);
			}
		}
	}
}
