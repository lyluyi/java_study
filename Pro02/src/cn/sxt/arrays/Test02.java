package cn.sxt.arrays;

// 数组三种初始化的方式

public class Test02 {
	public static void main(String[] args) {
			
		// 静态初始化
		int[] a = {2,4,65};
		
		User[] b = {
			new User(1, "a"),
			new User(2, "b"),
			new User(3, "c")
		};
		
		// 默认初始化
		int[] c = new int[3]; // 默认给数组的元素进行赋值 赋值的规则和成员变量默认赋值规则一致
		
		// 动态初始化
		int[] a1 = new int[2]; // 动态初始化数组 先分配空间
		
		a1[0] = 1;
		a1[1] = 2;
	}
}
