package cn.sxt.arrays;

// ����ı��� forEach

public class Test03 {
	public static void main(String[] args) {
			
			int[] arr01 = new int[10];		
			
			for (int i=0; i < arr01.length; i++) {
					arr01[i] = 10*i;
					System.out.println(arr01[i]);
			}
			
		// foreachѭ�����ڶ�ȡ����Ԫ�ص�ֵ �����޸�Ԫ�ص�ֵ
			for(int m : arr01) {
				System.out.println(m);
			}
			
	}
}