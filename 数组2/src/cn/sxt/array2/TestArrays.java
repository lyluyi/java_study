package cn.sxt.array2;

import java.util.Arrays;

// ����java.util.Arrays �������ʹ��

public class TestArrays {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {2,45,7,8,1,4,89};
		Object object = new Object();
//		object.toString();
		System.out.println(a);
		System.out.println(Arrays.toString(a)); // �����������
		Arrays.sort(b); // ����
		System.out.println(Arrays.toString(b));
		
		System.out.println(Arrays.binarySearch(b, 89)); // ����ƥ���� �оͷ�������index �� -1
	}
}
