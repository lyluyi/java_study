// 测试递归
public class TestRecursion01 {
	public static void main(String[] agrs) {
		a();
	}
	
	static int count = 0;
	static void a() {
		System.out.println("a");
		count++;
		if (count < 10) {
			a(); // 自己调用自己
		} else {
				return;
		}
	}
	
	static void b() {
		System.out.println("B");
	}
}
