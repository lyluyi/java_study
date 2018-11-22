package cn.sxt.test;

// 测试StringBuilder

public class TestStringBuilder {
	public static void main(String[] args) {
		TestStringBuilder str;
		
		// StringBuilder 线程不安全 效率高（一般使用它） StringBuffer 线程安全 效率低
		StringBuilder sb = new StringBuilder("aabbcc");
		
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
		
		sb.setCharAt(2, 'M');
		
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
		
	}
}
