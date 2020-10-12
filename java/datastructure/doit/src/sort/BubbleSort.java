package sort;

import java.util.Arrays;

public class BubbleSort {
	
	
	
	static void swap(int[] arr, int idx1,int idx2 ) {
		int t = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = t;
		
	}
	
	
	// bubble sort란 이웃한 두 요소를 비교하여 교환을 반복하는 정렬
	static int[] bubbleSort(int[] a,int n) {
		for(int i=0;i<n-1;i++) {
			for (int j =n-1 ;j>i;j--) {
				if(a[j]<a[j-1]) {
					swap(a,j-1,j);
				}
			}
		}

		
		return a;
	}

	public static void main(String[] args) {
		int[] a= {10,8,9,12,15};
		int n = a.length;
		
		int[] new_arr = bubbleSort(a, n);
		
		System.out.println(Arrays.toString(new_arr));

	}

}
