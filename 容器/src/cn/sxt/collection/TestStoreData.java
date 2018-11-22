package cn.sxt.collection;

//import java.awt.List;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// 测试表格数据存贮

public class TestStoreData {

		public static void main(String[] args) {
				
				// 表格第一行数据  可以使用map存放，也可以使用数组等其他
				
				// 整个表也可以使用list map等
				
				// ORM思想简单实现：map表示一行数据 多行数据 多个map 将多个map放到list中
				Map<String, Object> row1 = new HashMap<>();
				
				row1.put("id", 1001);
				row1.put("name", "aaa");
				row1.put("salary", 20000);
				row1.put("joinDate", "2018.5.5");
				
			// 表格第二行数据
				Map<String, Object> row2 = new HashMap<>();
				
				row2.put("id", 1002);
				row2.put("name", "bbb");
				row2.put("salary", 30000);
				row2.put("joinDate", "2014.10.5");
				
			// 表格第三行数据
				Map<String, Object> row3 = new HashMap<>();
				
				row3.put("id", 1003);
				row3.put("name", "ccc");
				row3.put("salary", 5000);
				row3.put("joinDate", "2020.8.5");
				
				List<Map<String, Object>> table1 = new ArrayList<>();
				
				table1.add(row1);
				table1.add(row2);
				table1.add(row3);
				
				// 这段代码 为什么这么写？？？
				for (Map<String, Object> row : table1) {
						
						Set<String> keySet = row.keySet();
						
						for (String key : keySet) {
								System.out.print(key + "..." + row.get(key) + "\t"); 
						}
						
						System.out.println();
				}
		}
		
}
