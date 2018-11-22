package cn.sxt.mycollection;

// 自定义实现ArrayList 体会底层原理  
// 增加泛型
// 增加数组扩容

public class SxtArrayList03<E> { // 增加泛型
	
	private Object[] elementData;
	private int size; // 定义的长度
	
	private static final int DEFALT_CAPACITY = 10; // 默认长度10
	
	public SxtArrayList03() { // 生成数组对象 并给定默认长度
		elementData = new Object[DEFALT_CAPACITY];
	}
	
	public SxtArrayList03(int capacity) { // 重写方法 可以自定义长度
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
		SxtArrayList03 s1 = new SxtArrayList03(20); // 定义了20的长度
		
		for (int i = 0; i < 40; i++) {
			s1.add("aaa" + i);
		}
		

		
		System.out.println(s1);  // 打印出来的结果 cn.sxt.mycollection.SxtArrayList03@6d06d69c
		// 希望可视化一点 于是重写toString方法

	}
}
