package sort;

import java.util.Arrays;

public class SelectSort {
	
	// 

	static void swap(int[] a, int idx1, int idx2) {

		int tmp = a[idx1];

		a[idx1] = a[idx2];
		a[idx2] = tmp;
		

	}

	static int[] selectSort(int[] a, int n) {

		for (int i = 0; i < n ; i++) {
			int min = i;
			System.out.println(Arrays.toString(a));
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
				
			}
			swap(a, i, min);
		}

		return a;
	}

	public static void main(String[] args) {
		int[] a = { 10, 8, 9, 12, 15 };
		int n = a.length;
		
		int[] new_arr = selectSort(a, n);
		System.out.println(Arrays.toString(new_arr));

	}
}
