package cn.sxt.test;

import java.util.Arrays;

// ���԰�װ��Integer ������װ�� ����

public class TestWrappedClass {
	public static void main(String[] args) {
			
//			int cc[];
//			cc=new int[] {1,2,3,4};
//			System.out.println(Arrays.toString(cc));
//			
//			int dd[];dd=new int[]{1,2,3,4};
//			System.out.println(Arrays.toString(dd));
//			
//			int[] aa = {1,2,3}; 
//			System.out.println(Arrays.toString(aa));
			
		// ������������ת��Ϊ��װ�ڶ���
		Integer a = new Integer(3); // ��ʱ �����ڶ��ڴ��� ͨ������������
		Integer b = Integer.valueOf(30); // �ٷ��Ƽ����� ��̬����
		
		// �Ѱ�װ�ڶ��� ת��Ϊ������������
		int c = b.intValue();
		double d = b.doubleValue();
		
		// ���ַ���ת�ɰ�װ�����
		Integer e = new Integer("9999");
//		Integer e = new Integer("9999ddd"); // ����תΪ���ֵ��ַ��� �ᱨ��
		
		// �Ѱ�װ�����ת��Ϊ�ַ���
		String str = e.toString();
	}
}
