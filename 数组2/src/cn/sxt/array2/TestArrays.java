package cn.sxt.array2;

import java.util.Arrays;

// 测试java.util.Arrays 工具类的使用

public class TestArrays {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {2,45,7,8,1,4,89};
		Object object = new Object();
//		object.toString();
		System.out.println(a);
		System.out.println(Arrays.toString(a)); // 输出数组内容
		Arrays.sort(b); // 排序
		System.out.println(Arrays.toString(b));
		
		System.out.println(Arrays.binarySearch(b, 89)); // 查找匹配项 有就返回索引index 无 -1
	}
}
