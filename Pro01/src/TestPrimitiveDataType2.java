import java.math.*; // ����math�� 

// ���Ը�������
public class TestPrimitiveDataType2 {
	
	public static void main(String[] args) {
		
		float a = 3.14F; 
		// �����ͳ���Ĭ��Ϊdouble����  double�����ǰ˸��ֽڣ���4���ֽڵ�float�д����ͻᱨ��
		// ��� ��F  ����Ϊfloat
		
		double b = 6.28;
		double c = 6.28E-2;
		
		System.out.println(c);
		
		// �������ǲ���ȷ�� һ����Ҫ���ڱȽ�
		float f = 0.1f;
		double d = 1.0/10;
		System.out.println(f==d); // false
		
		float d1 = 432432432f;
		float d2 = d1 + 1;
		if (d1 == d2) {
				System.out.println("d1 == d2"); // d1 == d2
 		} else {
				System.out.println("d1!=d2");
		}
		
		System.out.println("******************************");
		
		BigDecimal bd = BigDecimal.valueOf(1.0); // ��ʼһ��1.0��ֵ
		bd = bd.subtract(BigDecimal.valueOf(0.1)); // subtract ��0.1
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		
		System.out.println(bd); // 0.5
		System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1); // 0.5000000000000001
		
		BigDecimal bd2 = BigDecimal.valueOf(0.1);
		BigDecimal bd3 = BigDecimal.valueOf(1.0/10.0);
		System.out.println(bd2.equals(bd3)); // equals ��ȱȽ�   ���Ϊtrue
	}
}
