// 测试获得键盘输入
import java.util.Scanner;

public class TestScanner {
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in); // System.in IO流对象
		System.out.println("请输入你的名字");
		String name = scanner.nextLine(); // 获得这一行的输入 nextLine
		System.out.println("请输入你的爱好");
		String hoby = scanner.nextLine();
		System.out.println("请输入你的年龄");
		int age = scanner.nextInt();
		
		System.out.println("############");
		System.out.println(name);
		System.out.println(hoby);
		System.out.println(age);
	}
}
