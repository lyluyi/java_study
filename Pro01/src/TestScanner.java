// ���Ի�ü�������
import java.util.Scanner;

public class TestScanner {
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in); // System.in IO������
		System.out.println("�������������");
		String name = scanner.nextLine(); // �����һ�е����� nextLine
		System.out.println("��������İ���");
		String hoby = scanner.nextLine();
		System.out.println("�������������");
		int age = scanner.nextInt();
		
		System.out.println("############");
		System.out.println(name);
		System.out.println(hoby);
		System.out.println(age);
	}
}