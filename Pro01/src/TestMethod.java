// ������ʹ��
public class TestMethod {
	public static void main(String[] args) {
		// ͨ�����������ͨ����
			TestMethod tm = new TestMethod();
			tm.printSxt();
			tm.add(1, 2, 3);
	}
	
	void printSxt () { // ��void�ķ��� ����û�з���ֵ����˼
		System.out.println("1111");
		System.out.println("11112");
		System.out.println("11113");
	}
	
	void add(int a, int b, int c) {
			int sum = a + b +c;
			System.out.println(sum);
	}
}
