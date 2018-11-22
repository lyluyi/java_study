/**
  * 常量
 * 
 * 
 * */
public class TestConstant {
	public static void main(String[] args) {
		int age = 18;
		
		final String NAME = "luyi";
		
		final double PI = 3.14;
		// PI = 3.15 错误 不可重新复制
		double r = 4;
		double area = PI*r*r;
		double circle = 2*PI*r;
		System.out.println("area = :" + area);
		System.out.println("circle = :" + circle);
	}
}
