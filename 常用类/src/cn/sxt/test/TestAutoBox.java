package cn.sxt.test;

// �����Զ�װ�� ����

public class TestAutoBox {
	private static void main() {
	
		Integer a = 100;
		// Integer a = Integer.valueOf(234);  �Զ�װ��
		int b = a; // int b = a.intValue()  �Զ�����
		
		// ���桾-128��127��֮�������
		Integer in3 = 1234;
		Integer in4 = 1234;
		
		System.out.println(in3 == in4);  // false 1234���ڻ��淶Χ�� 
		System.out.println(in3.equals(in4)); // true
		
		Integer in1 = -128;
		Integer in2 = -128;
		
		System.out.println(in1 == in2); // true ��Ϊ-128�ڻ��淶Χ��
		System.out.println(in1.equals(in2)); // true
		
		// null �����޷�ʹ���Զ�ת��
		
		/**
		 * 
		 *   null��ʾiû��ָ���κζ����ʵ�壬
		 *   ����Ϊ���������ǺϷ���(��������������ƴ��Ƿ�ָ����ĳ�������ʵ��)��
		 *       ����ʵ����i��û��ָ���κζ����ʵ�壬����Ҳ�Ͳ����ܲ���intValue()������
		 *       ���������д��������ʱ�ͻ����NullPointerException����
		 * 
		 * **/
	}

}
