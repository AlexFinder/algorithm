package com.zhanggz.algorithm;

/**
 * 复习下相关排序算法
 * 
 * @author finder
 * @date 2015年6月5日
 */
public class Sort {

	/**
	 * 冒泡排序
	 * 
	 * @param arr
	 */
	public static void bubbleSort(int[] arr) {
		int temp = 0;
		for (int i = arr.length - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				// print(arr); // 打印过程
			} // loop j
		} // loop i
	}

	/**
	 * 选择排序
	 * 
	 * @param arr
	 */
	public static void selectionSort(int[] arr) {
		int temp, min = 0;
		for (int index = 0; index < arr.length; ++index) {
			min = index;
			// 循环查找最小值
			for (int j = index + 1; j < arr.length; ++j) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (min != index) {
				temp = arr[index];
				arr[index] = arr[min];
				arr[min] = temp;
			}
		}
	}

	/**
	 * 插入排序
	 * 
	 * @param arr
	 */
	public static void insertSort(int[] arr) {
		for(int i=1; i<arr.length; i++){
			int value = arr[i];
			int position = i;
			while(position > 0 && arr[position-1] > value){
				arr[position] = arr[position - 1];
				position--;
			}
			arr[position] = value;
		}
	}

	/**
	 * 打印数组
	 * 
	 * @param arr
	 */
	public static void print(int[] arr) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]).append(",");
		}
		System.out.println(sb.toString().substring(0, sb.length() - 1));
	}
}
