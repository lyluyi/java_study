package cn.sxt.collection;

import java.util.Map;
import java.util.TreeMap;

// TreeMap 使用

public class TestTreeMap {
		public static void main(String[] args) {
				Map<Integer, String> treemap1 = new TreeMap<>();
				
				treemap1.put(20, "aa");
				treemap1.put(3, "bb");
				treemap1.put(6, "cc");
				
				for (Integer key : treemap1.keySet()) { 
						System.out.println(key + "-----" + treemap1.get(key)); // 按照key自增的方式 输出
				}
				
				Map<Emp, String> treemap2 = new TreeMap<>();
				
				treemap2.put(new Emp(100, "AA", 10000), "A1");
				treemap2.put(new Emp(200, "BB", 5000), "B1");
				treemap2.put(new Emp(300, "CC", 6000), "C1");
				treemap2.put(new Emp(400, "CC", 6000), "C2");
				treemap2.put(new Emp(350, "CC", 6000), "C3");
				
				for (Emp key : treemap2.keySet()) { 
						System.out.println(key + "-----" + treemap2.get(key)); // 按照key自增的方式 输出
				}
		}
}

class Emp implements Comparable<Emp> { // Comparable若 一个类实现了Comparable接口，就意味着“该类支持排序”。
		
		int id;
		String name;
		double salary;
		
	
		
		public Emp(int id, String name, double salary) {
				super();
				this.id = id;
				this.name = name;
				this.salary = salary;
		}

		@Override
		public String toString() {
				return "id" + id  + " name" + name + " salary" + salary;
		}

		//  这个地方的this.salary o.salary 分别是指什么
		@Override
		public int compareTo(Emp o) { // 负数：小于0；等于  正数  大于
				if (this.salary > o.salary) {
						return 1;
				} else if (this.salary < o.salary) {
						return -1;
				} else {
						if (this.id > o.id) {
								return 1;
						} else if (this.id > o.id) {
								return -1;
						} else {
								return 0;
						}
				}
		}
		
		
}
