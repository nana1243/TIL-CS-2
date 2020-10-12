package sort;

import java.util.Arrays;

public class QuickSort {
	
	
	
	static void swap (int[]a , int idx1, int idx2) {
		int tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
		
	}
	
	
	static void quickSort(int[]a ,int left, int right) {
		int pl = left; // 왼쪽커서
		int pr = right; // 오른쪽 커서
		int x= a[(pl + pr)/2]; // 피벗
		
		do {
			while(a[pl] <x) {pl++;}
			while(a[pr] >x) {pr--;}
			
			if(pl<=pr) {
				swap(a,pl++,pr--);
			}
		}while(pl<=pr);
		
		if(left<pr) quickSort(a, left, pr);
		if(pl<right) quickSort(a, pl, right);
		
		
	}

	public static void main(String[] args) {
		
		int[] a = {10,12,13,7,12,9,92,33};
		int left = 0;
		int right = a.length-1;
		quickSort(a, left, right);
		System.out.println(Arrays.toString(a));
	
	}

}
