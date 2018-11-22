package cn.sxt.mycollection;

// 自定义实现ArrayList 体会底层原理

public class SxtArrayList01 {
	
	private Object[] elementData;
	private int size; // 定义的长度
	
	private static final int DEFALT_CAPACITY = 10; // 默认长度10
	
	public SxtArrayList01() { // 生成数组对象 并给定默认长度
		elementData = new Object[DEFALT_CAPACITY];
	}
	
	public SxtArrayList01(int capacity) { // 重写方法 可以自定义长度
		elementData = new Object[capacity];
	}
	
	public void add(Object obj) {
		elementData[size++] = obj;
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
		SxtArrayList01 s1 = new SxtArrayList01(20); // 定义了20的长度
		
		s1.add("aa");
		s1.add("bb");
		
		System.out.println(s1);  // 打印出来的结果 cn.sxt.mycollection.SxtArrayList01@6d06d69c
		// 希望可视化一点 于是重写toString方法

	}
}
