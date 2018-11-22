// 测试算数运算符

public class TestOperator01 {
	public static void main(String[] args) {
		byte a = 1;
		int b = 2;
		long b2 = 3;
//		byte c = a + b; 错误  没有long型  结果就是int型  因此 四个字节的byte不可能存8个字节的init
//		int c = a + b2; 错误  有long型 就为long型
		
		float f1 = 3.14F; // 加了F 表明是浮点型
		float d1 = b + b2;
		
//		float d2 = f1 + 6.2; 错误  6.2没有声明为浮点型 因此为double型 结果也应为double型
	}
}
