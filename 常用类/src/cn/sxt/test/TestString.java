package cn.sxt.test;

// ����String

public class TestString {
	public static void main(String[] args) {
		String str = "aaabbb"; // ��final ���ι���ʵ������ �����޷��Ա����������޸�
		String str2 = str.substring(2, 5);
		String a = "aaabbb";
		
		String a1 = "aaabbb";
		
		String a2 = new String("aaabbb");
		
		System.out.println(str == a); // ��ȫ�ֳ������� str a ������ͬһ����aaabbb������
		System.out.println(a1 == a2); // һ���ڳ����ض���  һ�������ö��ڴ���
		
		System.out.println(str);
		System.out.println(str2);
		
		String aa = new String("aa") + new String("bb");
		String bb = new String("aa") + new String("bb");
		
		String str11 = new String("SEU")+ new String("Calvin");    
		System.out.println(str11.intern() == str11); 
		System.out.println(str11 == "SEUCalvin");
		
		System.out.println(aa == bb);  // false
		// �ַ����Ƚ���equals���� �޷�ʹ��==  
	}
}
