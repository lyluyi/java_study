package cn.sxt.collection;

import java.util.HashSet;
import java.util.Set;

// 测试set  没有顺序 不可重复  list 有顺序 可以重复

public class TestHashSet {
		public static void main(String[] args) {
				Set<String> set1 = new HashSet<>();
				
				set1.add("aa"); // 实际上相当于添加HashMap的key 因为Map的key 不可以重复
				set1.add("bb");
				set1.add("cc");
				set1.add("dd");
				
				System.out.println(set1); //[aa, bb, cc, dd]
				
				set1.remove("bb");
				
				System.out.println(set1); // [aa, cc, dd]
				
				Set<String> set2 = new HashSet<>(); //[aa, cc, dd]
				
				set1.add("aa");
				
				set2.addAll(set1);
				
				System.out.println(set2); // 
				
		}
}
