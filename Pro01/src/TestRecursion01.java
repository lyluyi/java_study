// ���Եݹ�
public class TestRecursion01 {
	public static void main(String[] agrs) {
		a();
	}
	
	static int count = 0;
	static void a() {
		System.out.println("a");
		count++;
		if (count < 10) {
			a(); // �Լ������Լ�
		} else {
				return;
		}
	}
	
	static void b() {
		System.out.println("B");
	}
}