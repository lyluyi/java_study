package cn.sxt.collection;

// 这里导包经常自动导入错误
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Collection 辅助类的使用  工具类 ！！！不是接口

public class TestCollections {
		public static void main(String[] args) {
			 List<String> list = new ArrayList<>();
			 
			 for (int i = 0; i < 10; i++) {
					 list.add("gao" + i);
			 }
			 
			 System.out.println(list);
			 
			 Collections.shuffle(list); // 随机排列
			 System.out.println(list);
			 
			 Collections.reverse(list); // 逆序排列
			 System.out.println(list); 
			 
			 Collections.sort(list); // 按照递增排序
			 System.out.println(list);
			 
			 System.out.println(Collections.binarySearch(list, "gao1"));
		}
}
