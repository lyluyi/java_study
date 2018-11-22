package cn.sxt.mycollection;

import java.io.ObjectInputStream.GetField;

import javax.management.RuntimeErrorException;

// 自定义实现ArrayList 体会底层原理  
// 增加泛型
// 增加数组扩容
// 增加set get 方法 增加数组边界检查

public class SxtArrayList04<E> { // 增加泛型
	
	private Object[] elementData;
	private int size; // 定义的长度
	
	private static final int DEFALT_CAPACITY = 10; // 默认长度10
	
	public SxtArrayList04() { // 生成数组对象 并给定默认长度
		elementData = new Object[DEFALT_CAPACITY];
	}
	
	public SxtArrayList04(int capacity) { // 重写方法 可以自定义长度
			// 创建的时候 也要进行越界检查
			if (capacity < 0) {
				throw new RuntimeErrorException(null, "容器的容量不能为负数");
			} else if (capacity == 0) { // 如果传入为0 那么默认生成10的长度
				elementData = new Object[DEFALT_CAPACITY];	
			} else { // 
				elementData = new Object[capacity];	
			}
		elementData = new Object[capacity];
	}
	
	public void add(E element) {
		
		// 什么时候扩容
		if (size == elementData.length) { // 判断是否需要扩容
				// 怎么扩容
				Object[] newArray = new Object[elementData.length + (elementData.length >> 1)]; // 右移一位 即原长度的一半
				System.arraycopy(elementData, 0, newArray, 0, elementData.length);
				elementData = newArray;
		}
			elementData[size++] = element; // 添加元素
	}
	
	public E get(int index) { // 返回一个泛型
			checkRange(index);
		return (E)elementData[index];
	}
	
	public void set(E element, int index) {
			checkRange(index);
		
			elementData[index] = element;
	}
	
	public void checkRange(int index) {
		// 判断索引是否越界 [0, size) 10 0-9
		if (index < 0 || index> size - 1) {
			throw new RuntimeErrorException(null, "索引越界" + index);	
		}
	}
	
	@Override
	public String toString() { //
		StringBuilder sb = new StringBuilder();
		
		// [a,b,c] 打印的效果
		sb.append("[");
		for (int i = 0; i < size; i++) {
			sb.append(elementData[i] + ",");
		}
		sb.setCharAt(sb.length()-1, ']'); // "]" 用双引号就错误 双引号是String类型 sb 是StringBuilder的类 只能存char
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		SxtArrayList04 s1 = new SxtArrayList04(20); // 定义了20的长度
		
		for (int i = 0; i < 40; i++) {
			s1.add("aaa" + i);
		}
		

		
		System.out.println(s1);  // 打印出来的结果 cn.sxt.mycollection.SxtArrayList04@6d06d69c
		// 希望可视化一点 于是重写toString方法
		
		System.out.println(s1.get(10)); // aaa10;
		s1.set("bbb10", 10);
		System.out.println(s1); // aaa10 被set成bbb 10
		
//		System.out.println(s1.get(40));
//		s1.set("aaa41", 41);
		

	}
}
