package cn.sxt.array2;

import java.util.Arrays;

// 测试数组存贮表格数据

public class TestAaaryTable {
	public static void main(String[] args) {
			Object[] emp1 = {1001, "aaa", 18, "qqq", "2018.1.1"};
			Object[] emp2 = {1002, "aaa", 18, "qqq", "2018.1.1"};
			Object[] emp3 = {1003, "aaa", 18, "qqq", "2018.1.1"};
			
			Object[][] tableData = new Object[3][];
			tableData[0] = emp1;
			tableData[1] = emp2;
			tableData[2] = emp1;
			
			for (Object[] temp: tableData) {
					System.out.println(Arrays.toString(temp));
			}
	}
}
