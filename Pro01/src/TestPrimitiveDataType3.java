// 测试字符类型
public class TestPrimitiveDataType3 {
	public static void main(String[] args) {
		char a = 'T'; // 用单引号表示一个字符
		char b = '好';
		char c = '\u0061';
		System.out.println(c); // a
		
		// 转义字符
		System.out.println("" + 'a'+ '\n' + 'b'); // '\n' 转义字符
		
		boolean man = true;
		if (man) {
			System.out.println("男");
		}
	}
}
