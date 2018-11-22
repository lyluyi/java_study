package cn.sxt.array2;

import java.util.Arrays;

// 测试二分法查找

public class TestBinarySearch {
	public static void main(String[] args) {
			int[] arr = { 3,5,81,23,45,7,1,4,67,49,65 };
			Arrays.sort(arr); // 二分法查找之前一定要对数组进行排序
			
//			int value = 23;
			System.out.println(Arrays.toString(arr));
			System.out.println(myBinarySearch(arr, 23));
	}
	
	public static int myBinarySearch(int[] arr, int value) {
		int low = 0;
		int high = arr.length - 1;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			
			
			if (value == arr[mid]) {
				return mid;
			}
			
			if (value > arr[mid]) {
				low = mid + 1;
			}
			
			if (value < arr[mid]) {
				high = mid - 1; 
			}
		}
		return -1;
	}
}
