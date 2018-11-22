package cn.sxt.collection;

import java.util.*;
import java.util.Map.Entry;

// 测试迭代器遍历List Set Map

public class TestIterator {
		
		public static void main(String[] args) {
				testIteratorList();
				
				testIteratorSet();
				
				testIteratorMap();
		}
		
		public static void testIteratorList() {
				List<String> list = new ArrayList<>();
				
				list.add("aa");
				list.add("bb");
				list.add("cc");
				list.add("dd");
				
				
				// 使用迭代器遍历list
				for (Iterator<String> iter=list.iterator(); iter.hasNext();) {
						// iter=list.iterator() 返回一个迭代器  iter.hasNext() 判断 有没有下一个
						String temp = iter.next();
						System.err.println(temp);
				}
		}
		
		
		public static void testIteratorSet() {
				Set<String> set = new HashSet<>();
				
				set.add("aa");
				set.add("bb");
				set.add("cc");
				set.add("dd");
				
				// 使用迭代器遍历list
				for (Iterator<String> iter=set.iterator(); iter.hasNext();) {
						// iter=set.iterator() 返回一个迭代器  iter.hasNext() 判断 有没有下一个
						String temp = iter.next();
						System.err.println(temp);
				}
		}


    public static void testIteratorMap() {
    		// 这几段代码是干嘛的？
    		Map<Integer, String> map = new HashMap<>();
    		
    		map.put(100, "aa");
    		map.put(200, "bb");
    		map.put(300, "cc");
    		
    		// 第一种遍历map的方式  Entry的内部类
    		Set<Entry<Integer, String>> ss = map.entrySet(); // 获取键值对的集合
    		
    		for (Iterator<Entry<Integer, String>> iter = ss.iterator(); iter.hasNext();) {
						Entry<Integer, String> temp = iter.next();
						
						System.out.println(temp.getKey() + "=====" + temp.getValue());
						
				}
    		
    		// 第二种遍历map的方式
    		Set<Integer> keySet = map.keySet();  // 获取key的集合
    		
//    		for (Iterator iterator = keySet.iterator(); iterator.hasNext();) {
//						Integer integer = (Integer) iterator.next();
//						
//				}

    		// 这两种写法有什么区别
    		for (Iterator<Integer> iter = keySet.iterator(); iter.hasNext();) {
						Integer key = iter.next();
						
						System.out.println(key + "--------" + map.get(key));
						
				}
    		
    		
    		
    }

}

