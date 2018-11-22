package cn.sxt.test;

import java.util.Arrays;

// 测试包装类Integer 其它包装类 类似

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
			
		// 基本数据类型转换为包装内对象
		Integer a = new Integer(3); // 此时 存贮在堆内存中 通过对象构造器。
		Integer b = Integer.valueOf(30); // 官方推荐方法 静态方法
		
		// 把包装内对象 转换为基本数据类型
		int c = b.intValue();
		double d = b.doubleValue();
		
		// 把字符串转成包装类对象
		Integer e = new Integer("9999");
//		Integer e = new Integer("9999ddd"); // 不能转为数字的字符串 会报错
		
		// 把包装类对象转换为字符串
		String str = e.toString();
	}
}
