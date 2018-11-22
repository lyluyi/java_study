package cn.sxt.array2;

import java.util.Arrays;

// ≤‚ ‘√∞≈›≈≈–Ú

public class TestBubbleSort {
	public static void main(String[] args) {
		int[] values = { 3,5,81,23,45,7,1,4,67 };
		
		int temp = 0;
		for (int j = 0; j < values.length - 1; j++) {
				boolean flag = true;
			for (int i = 0; i < values.length - 1 - j; i++) {
				// ±»Ωœ¥Û–° ΩªªªÀ≥–Ú
				if (values[i] > values[i+1]) {
						temp = values[i];
						values[i] = values[i+1];
						values[i+1] = temp;
						
						flag = false;
				}
				System.out.println(Arrays.toString(values));
			}
			if (flag) {
				System.out.println("&&&&&&&&&&&&&&&&");
				break;
			}
			System.out.println("******************");
		}
	}
}
