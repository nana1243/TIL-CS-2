package search;

import java.util.Comparator;

public class p3 {
	
	
	private static class Comp implements Comparator<Integer>{
		@Override
		public int compare(Integer d1, Integer d2) {
			if(d1>d2) {
				return 1;
				}
			else if(d1<d2) {
				return -1;
				}
			else {
				return 0;
			}			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,6,7,8,9,12,0,100,23};
		Comp comp = new Comp();
		
		for (int i=0;i<arr.length;i++) {
			for(int j =i+1;j<arr.length;j++) {
				int tmp = comp.compare(arr[i], arr[j]);
				if(tmp==1) {
					System.out.println(arr[i]+ " > " +arr[j]);
				}else if(tmp==-1) {
					System.out.println(arr[i]+ " < " +arr[j]);
				}else {
					System.out.println(arr[i]+ " == " +arr[j]);
				}
			}
		}
		
		
		
	}

}

