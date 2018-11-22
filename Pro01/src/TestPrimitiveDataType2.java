import java.math.*; // 导入math包 

// 测试浮点类型
public class TestPrimitiveDataType2 {
	
	public static void main(String[] args) {
		
		float a = 3.14F; 
		// 浮点型常量默认为double类型  double类型是八个字节，往4个字节的float中存贮就会报错，
		// 因此 加F  表明为float
		
		double b = 6.28;
		double c = 6.28E-2;
		
		System.out.println(c);
		
		// 浮点数是不精确的 一定不要用于比较
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
		
		BigDecimal bd = BigDecimal.valueOf(1.0); // 初始一个1.0的值
		bd = bd.subtract(BigDecimal.valueOf(0.1)); // subtract 减0.1
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		
		System.out.println(bd); // 0.5
		System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1); // 0.5000000000000001
		
		BigDecimal bd2 = BigDecimal.valueOf(0.1);
		BigDecimal bd3 = BigDecimal.valueOf(1.0/10.0);
		System.out.println(bd2.equals(bd3)); // equals 相等比较   结果为true
	}
}
