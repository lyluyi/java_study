package cn.sxt.collection;

// ���ﵼ�������Զ��������
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Collection �������ʹ��  ������ ���������ǽӿ�

public class TestCollections {
		public static void main(String[] args) {
			 List<String> list = new ArrayList<>();
			 
			 for (int i = 0; i < 10; i++) {
					 list.add("gao" + i);
			 }
			 
			 System.out.println(list);
			 
			 Collections.shuffle(list); // �������
			 System.out.println(list);
			 
			 Collections.reverse(list); // ��������
			 System.out.println(list); 
			 
			 Collections.sort(list); // ���յ�������
			 System.out.println(list);
			 
			 System.out.println(Collections.binarySearch(list, "gao1"));
		}
}
