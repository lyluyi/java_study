// �������أ�
/*
 * 
 * 
 * �������ص��������β����͡������������β�˳��ͬ������ֻ�з���ֵ��ͬ
 * �����ɷ�������
 * 
 * ֻ���β����Ʋ�ͬ Ҳ�����ɷ�������
 * */
public class TestOverload {
	public static void main(String[] args) {
		System.out.println(add(3, 5));
	}
	
	// ���`
	public static int add(int n1, int n2) { // int �� double�ķ���ֵ��ͬ��������ͬ Ҳ�����������
		int sum = n1 + n2;
		return sum;
	}
	
//	public static double add(int n1, int n2) { // �����βε�ʱ�� �ͻᱨ�� ��һ��n3�Ϳ���
//		double sum = n1 + n2;
//		return sum;
//	}
//	
}