package cn.sxt.test;

// ����StringBuilder

public class TestStringBuilder {
	public static void main(String[] args) {
		TestStringBuilder str;
		
		// StringBuilder �̲߳���ȫ Ч�ʸߣ�һ��ʹ������ StringBuffer �̰߳�ȫ Ч�ʵ�
		StringBuilder sb = new StringBuilder("aabbcc");
		
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
		
		sb.setCharAt(2, 'M');
		
		System.out.println(Integer.toHexString(sb.hashCode()));
		System.out.println(sb);
		
	}
}
