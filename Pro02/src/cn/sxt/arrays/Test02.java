package cn.sxt.arrays;

// �������ֳ�ʼ���ķ�ʽ

public class Test02 {
	public static void main(String[] args) {
			
		// ��̬��ʼ��
		int[] a = {2,4,65};
		
		User[] b = {
			new User(1, "a"),
			new User(2, "b"),
			new User(3, "c")
		};
		
		// Ĭ�ϳ�ʼ��
		int[] c = new int[3]; // Ĭ�ϸ������Ԫ�ؽ��и�ֵ ��ֵ�Ĺ���ͳ�Ա����Ĭ�ϸ�ֵ����һ��
		
		// ��̬��ʼ��
		int[] a1 = new int[2]; // ��̬��ʼ������ �ȷ���ռ�
		
		a1[0] = 1;
		a1[1] = 2;
	}
}
