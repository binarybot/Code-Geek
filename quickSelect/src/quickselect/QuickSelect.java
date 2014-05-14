/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quickselect;

import java.util.Random;

/**
 *
 * @author Mohan
 */
public class QuickSelect {
private static <E extends Comparable<? super E>> int partition(E[] arr, int left, int right, int pivot) {
		E pivotVal = arr[pivot];
		swap(arr, pivot, right);
		int storeIndex = left;
		for (int i = left; i < right; i++) {
			if (arr[i].compareTo(pivotVal) < 0) {
				swap(arr, i, storeIndex);
				storeIndex++;
			}
		}
		swap(arr, right, storeIndex);
		return storeIndex;
	}
 
	private static <E extends Comparable<? super E>> E select(E[] arr, int n) {
		int left = 0;
		int right = arr.length - 1;
		Random rand = new Random();
		while (left<=right) {
			int pivotIndex = partition(arr, left, right, rand.nextInt(right - left + 1) + left);
			if (pivotIndex == n) {
				return arr[pivotIndex];
			} else if (pivotIndex < n) {
				left = pivotIndex - 1;
			} else {
				right = pivotIndex + 1;
			}
		}
		return null;
	}
 
	private static void swap(Object[] arr, int i1, int i2) {
		if (i1 != i2) {
			Object temp = arr[i1];
			arr[i1] = arr[i2];
			arr[i2] = temp;
		}
	}
 
	public static void main(String[] args) {
		//for (int i = 0; i < 10; i++) {
			Integer[] input = { 2, 3, 5, 4, 1, 12, 11, 13, 16, 7, 8, 6, 10, 9, 17,
15, 19, 20, 18, 23, 21, 22, 25, 24, 14};
			System.out.print(select(input, 7));
			//if (i < 9) System.out.print(", ");
		//}
		System.out.println();
	}
    
    
}
