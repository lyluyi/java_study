package cn.sxt.exception;

public class Test01 {
	public static void main(String[] args) {
		String str = null;
//		str.length(); // java.lang.NullPointerException 空指针
		if (str != null) {
			System.out.println(str.length());
		}
		
		Animal a=new Dog();
//    Cat c=(Cat)a;   java.lang.ClassCastException  在引用数据类型转换时，有可能发生类型转换异常(ClassCastException)。
		
	}

}

class Animal{
    
}
class Dog extends Animal{
     
}
class Cat extends Animal{
     
}
