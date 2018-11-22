package cn.sxt.oo;

// 测试封装02 

import cn.sxt.oo2.Human;


public class TestEncapsulation02 {
	public static void main(String[] args) {
		Human h = new Human();
//		h.height = 170;  // 此时不同包下面 protected 修饰的类 无法被访问
			
	}
}

class Girl extends Human { 
	void sayGood() {
		System.out.println(heigth); // 不同包下面 继承了父类后 protected的属性仍让可以被访问
	}
}