package sort;

import java.util.Arrays;

public class ShellSort {
	
	
	static int[] shellSort(int[]a, int n) {
		System.out.println(Arrays.toString(a));
		for(int h = n/2 ;h>0;h--) {
			System.out.println("h : " +h);
			for(int i=h ; i<n; i++) {
				int j;
				int tmp = a[i];
				
				for(j = i-h;j>=0 && a[j]>tmp ;j-=h ) {
					a[j+h] = a[j];
					
				}
				a[j+h] = tmp;
				
				
			}
			System.out.println(Arrays.toString(a));
		}
		
		
		return a;
	}

	public static void main(String[] args) {
		int[] a = { 10, 12, 9, 8, 15,2,3,4 };
		int n = a.length;
		
		int[] new_arr = shellSort(a, n);
		System.out.println(Arrays.toString(new_arr));


	}

}
