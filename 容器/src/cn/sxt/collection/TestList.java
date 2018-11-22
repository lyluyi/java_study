package cn.sxt.collection;

import java.util.*;
import java.util.ArrayList;
import java.util.Collection;

// 测试 Collection接口 中的 List方法

public class TestList {	
	public static void main(String[] args) {
//		test01();
//			test02();
			test03();
	}
	
	public static void test01() {
			Collection<String> c = new ArrayList<>();
			
			
			c.isEmpty(); // 判断是否为空
			
			c.add("aaa");
			c.add("bbb");
			System.out.println(c);
			c.size(); // 返回长度
			System.out.println(c.size());
			
			System.out.println(c.contains("aaa")); // 是否包含”aaa“  返回true
			
			Object object = c.toArray(); // 转化为object数组
			
			System.out.println(object); //
			
			c.remove("aaa"); // 移除 只是移除容器中的引用地址 并非移除了 “aaa”对象
			System.out.println(c);
			System.out.println(c.size());
			
			c.clear();
			System.out.println(c);
	}
	
	public static void test02() {
		Collection<String> list01 = new ArrayList<>();
/*
 *  这里用 Collection  Set 也可以  Set List都是继承于Collection
 *  
 *  List 有序 元素可以重复
 *  
 *  Set 无序 元素不可以重复  // 暂时的理解
 * 
 * */	
//		List<String> list01 = new ArrayList<>();
		list01.add("aa");
		list01.add("bb");
		list01.add("cc");
		
		List<String> list02 = new ArrayList<>();
		list02.add("aa");
		list02.add("dd");
		list02.add("ee");
		list02.add("ee");
		
		
		
//		list01.addAll(list02); // 合并list02 可以有相同的元素
//		System.out.println(list01); // [aa, bb, cc, aa, dd, ee, ee]  允许元素重复
		
		
//		list01.removeAll(list02); // 移除 与list02中相同的元素
		list01.retainAll(list02);// 取list02的交集
		System.out.println("list01:" + list01);
		
		System.out.println(list01.containsAll(list02)); // 是否完全包含list02
	
	}
	
	public static void test03() {
		/*
		 * List接口常用的实现类有三个：ArrayList LinkedList 和 Vector
		 * ArrayList Vector 都是通过数组实现  Vector的线程更加安全
		 * 
		 * ArrayList 查询效率高 增删效率低 线程不安全  一般都使用ArrayList
		 * 
		 * 数组的长度是有限的 ，而ArrayList的是可以存放任意数量的对象
		 * 长度不受限制  它是基于数组扩容实现的 超过长度时 重新定义一个
		 * 新的长度更长的数组，再把原数组的内容copy进去
		 * 
		 * 将
		 * **/		
			
		// 测试跟索引相关的方法
			List<String> list = new ArrayList<>();
			list.add("A");
			list.add("B");
			list.add("C");
			list.add("D");
			list.add("E"); // 默认往尾部插入
			list.add(0,"aa"); // 加index 索引 插入
			
			System.out.println(list);
			
			list.remove(0); // 删除 index = 0 索引的元素
			
			System.out.println(list);
			
			list.set(2, "CC"); // set index = 2索引的元素
			list.get(2); // 取对应索引的值
			System.out.println(list);
			
			list.add("C");
			list.add("B");
			list.add("A");
			
			System.out.println(list);
			
			System.out.println(list.indexOf("G")); // -1 不存在时
			System.out.println(list.lastIndexOf("B")); // 最后出现的索引 -1 不存在
	}
}
