/**
  * 测试数据进制
 * 
 * */
public class TestPrimitiveDataType {
	public static void main(String[] args) {
		// 测试进制
		int a = 15;
		int b = 015; // 以0开头是八进制
		int c = 0x15; // 以0x开头是十六进制
		int d = 0b1101; // 以0b开头是二进制
		

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
