//  this ���� ����

public class TestThis {
	int a,b,c; // ��Ա���� abc
	
	TestThis(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	TestThis(int a, int b, int c) { // ������һ�� TestThis ����
		this(a, b); // ʹ��this�ؼ��ֵ������صĹ��췽��  ������ڹ��췽���еĵ�һ��   
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
