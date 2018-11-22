package cn.sxt.oo2;

public class Human {
		private int age;
		String name; // 只能被本包下面的类访问 这种跨包的情况  default 的类型
		protected int heigth;
		
		
		void sayAge () {
			System.out.println(age);
		}
}
