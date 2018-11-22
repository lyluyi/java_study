package cn.sxt.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ForkJoinPool;

// 测试表格数据存贮

// 体会ORM思想

// 每一行数据使用javaBean对象存储 多行使用放到map和list中

public class TestStoreData2 {
		
		public static void main(String[] args) {
				User user1 = new User(1001, "aa", 2000, "2018.5.4");
				User user2 = new User(1002, "bb", 3000, "2018.6.4");
				User user3 = new User(1003, "cc", 4000, "2018.7.4");
				
				// 用list存贮
				List<User> list = new ArrayList<>();
				
				list.add(user1);
				list.add(user2);
				list.add(user3);
				
				for(User u : list) {
						System.out.println(u);
				}
				
				// 用map封装
				Map<Integer, User> map = new HashMap<>();
				
				map.put(1001, user1);
				map.put(1002, user2);
				map.put(1003, user3);
				
				Set<Integer> keySet = map.keySet();
				for (Integer key : keySet) {
						System.out.println(key + "====" + map.get(key));
				}
				
		}
		
}

class User {
		private int id;
		private String name;
		private double salary;
		private String hireDate;
		
		//一个完整的javabean 要有set和get方法  以及无参数构造器
		
		public User() {
		}
		
		public User(int id, String name, double salary, String hireDate) {
				super();
				this.id = id;
				this.name = name;
				this.salary = salary;
				this.hireDate = hireDate;
		}

		public int getId() {
				return id;
		}

		public void setId(int id) {
				this.id = id;
		}

		public String getName() {
				return name;
		}

		public void setName(String name) {
				this.name = name;
		}

		public double getSalary() {
				return salary;
		}

		public void setSalary(double salary) {
				this.salary = salary;
		}

		public String getHireDate() {
				return hireDate;
		}

		public void setHireDate(String hireDate) {
				this.hireDate = hireDate;
		}
		
		
		@Override
		public String toString() {
				return "id" + id + " name" + name + " salary" + salary + " date" + hireDate;
		}
}
