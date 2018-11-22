package cn.sxt.test;

// 测试自动装箱 拆箱

public class TestAutoBox {
	private static void main() {
	
		Integer a = 100;
		// Integer a = Integer.valueOf(234);  自动装箱
		int b = a; // int b = a.intValue()  自动拆箱
		
		// 缓存【-128，127】之间的数字
		Integer in3 = 1234;
		Integer in4 = 1234;
		
		System.out.println(in3 == in4);  // false 1234不在缓存范围内 
		System.out.println(in3.equals(in4)); // true
		
		Integer in1 = -128;
		Integer in2 = -128;
		
		System.out.println(in1 == in2); // true 因为-128在缓存范围内
		System.out.println(in1.equals(in2)); // true
		
		// null 类型无法使用自动转换
		
		/**
		 * 
		 *   null表示i没有指向任何对象的实体，
		 *   但作为对象名称是合法的(不管这个对象名称存是否指向了某个对象的实体)。
		 *       由于实际上i并没有指向任何对象的实体，所以也就不可能操作intValue()方法，
		 *       这样上面的写法在运行时就会出现NullPointerException错误。
		 * 
		 * **/
	}

}
