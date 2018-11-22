// 方法重载：
/*
 * 
 * 
 * 方法重载的条件：形参类型、参数个数、形参顺序不同。但是只有返回值不同
 * 不构成方法重载
 * 
 * 只有形参名称不同 也不构成方法重载
 * */
public class TestOverload {
	public static void main(String[] args) {
		System.out.println(add(3, 5));
	}
	
	// 求和`
	public static int add(int n1, int n2) { // int 和 double的返回值不同，其它相同 也不会进行重载
		int sum = n1 + n2;
		return sum;
	}
	
//	public static double add(int n1, int n2) { // 声明形参的时候 就会报错 加一个n3就可以
//		double sum = n1 + n2;
//		return sum;
//	}
//	
}
