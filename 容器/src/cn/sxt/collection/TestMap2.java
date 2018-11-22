package cn.sxt.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap2 {
		public static void main(String[] args) {
				
				Employee e1 = new Employee(1001, "aaa", 2000);
				Employee e2 = new Employee(1002, "bbb", 3000);
				Employee e3 = new Employee(1003, "ccc", 4000);
				
				Map<Integer, Employee> map = new HashMap<>();
				
				map.put(1001, e1);
				map.put(1002, e2);
				map.put(1003, e3);
				
				Employee emp = map.get(1001);
				System.out.println(emp.getEname());
				
				System.out.println(emp);
		}

}

// 雇员信息
class Employee {
		private int id;
		private String ename;
		private double salay;
		
		
		public Employee(int id, String ename, double salay) {
				super();
				this.id = id;
				this.ename = ename;
				this.salay = salay;
		}

		@Override
		public String toString() {
				return "id: " + id + " ename：" + ename + " 薪水：" + salay;
		}
		
		public int getId() {
				return id;
		}


		public void setId(int id) {
				this.id = id;
		}


		public String getEname() {
				return ename;
		}


		public void setEname(String ename) {
				this.ename = ename;
		}


		public double getSalay() {
				return salay;
		}


		public void setSalay(double salay) {
				this.salay = salay;
		}
}

