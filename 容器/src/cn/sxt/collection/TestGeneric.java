package cn.sxt.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// ���Է��� �޶�������������

public class TestGeneric {
	public static void main(String[] args) {
		MyCollection<String> mc = new MyCollection<String>();
		
		mc.set("aaa", 0);
//		mc.set(888, 1); // ���Ͷ��崫���String ��˱���
		mc.set("888", 1);
		mc.set("ccc", 2);
		
//		System.out.println(mc.get(1));
		
		String a = mc.get(1);
		
		// Ϊʲô����Ҫתstring 
		// û���÷������޶�֮ǰ ��Ҫ��String ����ת��
		String b = (String)mc.get(0);
		
		List list = new ArrayList<>();
		Map map = new HashMap<>();
	}
}

class MyCollection<E> {
		Object[] objs = new Object[5];
		
		public void set(E e, int index) {
			objs[index] = e;	
		}
		
		public E get(int index) {
				return (E) objs[index];
		}
}
