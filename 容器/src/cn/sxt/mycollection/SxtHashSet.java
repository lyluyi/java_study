package cn.sxt.mycollection;

import java.util.HashMap;

import javax.naming.InitialContext;

// 手动实现一个HashSet 理解HashSet 底层原理

public class SxtHashSet {
		HashMap map;
		
		private static final Object PRESENT = new Object();
		
		public SxtHashSet() {
				map = new HashMap();
		}
		
		public int size() {
				return map.size();
		}
		
		public void add(Object o) {
				map.put(o, PRESENT);
		}
		
		@Override
		public String toString() {
				StringBuilder sb = new StringBuilder();
				sb.append("[");
				
				for (Object key : map.keySet()) {
						sb.append(key + ",");
				}
				
				sb.setCharAt(sb.length() - 1, ']');
				
				return sb.toString();
		}
		
		public static void main(String[] args) {
				SxtHashSet set = new SxtHashSet();
				
				set.add("aaa");
				set.add("aa1");
				set.add("aa2");
				System.out.println(set); // [aaa,aa1,aa2]
		}
		
}
