package cn.sxt.test;

// 测试String

public class TestString {
	public static void main(String[] args) {
		String str = "aaabbb"; // 用final 修饰过的实例对象 所以无法对变量本身作修改
		String str2 = str.substring(2, 5);
		String a = "aaabbb";
		
		String a1 = "aaabbb";
		
		String a2 = new String("aaabbb");
		
		System.out.println(str == a); // 在全局常量池中 str a 引用了同一个“aaabbb”对象
		System.out.println(a1 == a2); // 一个在常量池堆中  一个在引用堆内存中
		
		System.out.println(str);
		System.out.println(str2);
		
		String aa = new String("aa") + new String("bb");
		String bb = new String("aa") + new String("bb");
		
		String str11 = new String("SEU")+ new String("Calvin");    
		System.out.println(str11.intern() == str11); 
		System.out.println(str11 == "SEUCalvin");
		
		System.out.println(aa == bb);  // false
		// 字符串比较用equals方法 无法使用==  
	}
}
