/**
 * 
 */
package com.zhanggz.algorithm;

import junit.framework.TestCase;

/**
 * @author zhanggz
 *
 * @date 2015年6月5日
 */
public class SortTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	/**
	 * Test method for {@link com.zhanggz.algorithm.Sort#bubbleSort(int[])}.
	 */
	public void testBubbleSort() {
		int[] arr = { 10, 2, 3, 5, 12, 1, 0, 9 };
		Sort.bubbleSort(arr);
		Sort.print(arr);
	}
	
	public void testSelectionSort() {
		int[] arr = { 10, 2, 3, 5, 12, 1, 0, 9 };
		Sort.selectionSort(arr);
		Sort.print(arr);
	}
	
	public void testInsertrSort() {
		int[] arr = { 10, 2, 3, 5, 12, 1, 0, 9 };
		Sort.insertSort(arr);
		Sort.print(arr);
	}
}
