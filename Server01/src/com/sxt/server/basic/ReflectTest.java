package com.sxt.server.basic;

import java.lang.reflect.InvocationTargetException;

/*
 * 
 * 反射：把java类中的各种结构（方法、属性、构造器、类名）映射成一个个java对象
 * 
 *  三种方式： Class.forName("包名.类名")
 *  
 *  clz.getConstructor().newInstance()
 * 
 */

public class ReflectTest {

		public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
				
				// 三种方式
				
				// 1 对象.getClass()
				
				Iphone iphone = new Iphone();
				Class clz = iphone.getClass();
				
				// 2. 类.class
				
				clz = Iphone.class;
				
				// 3. Class.forName("包名.类型")
				
				clz = Class.forName("com.sxt.server.basic.Iphone");
				
				// 通过反射获取到类后 创建对象 通过构造器的方法  JDK 9以上推荐
				
				Iphone iphone2 = (Iphone)clz.getConstructor().newInstance();
				
				System.out.println(iphone2);
				
		}
}

class Iphone {
	public Iphone()	{ // 无参构造
			
	}
}
