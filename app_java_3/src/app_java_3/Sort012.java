package app_java_3;

import java.util.Arrays;

public class Sort012 {

	public static void main(String[] args) {
		int[] arr = {2, 0, 2, 1, 1, 0};
		sortColors(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sortColors(int arr[]) {
		int low=0;
		int mid=0;
		int high=arr.length-1;
		
		while(mid<=high) {
			switch(arr[mid]) {
			case 0:
				// Swap arr[low] and arr[mid], increment low and mid
				int temp0=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp0;
				low++;
				mid++;
				break;
				
			case 1:
				// Just move the mid pointer
				mid++;
				
			case 2:
				 // Swap arr[mid] and arr[high], decrement high
				int temp2=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp2;
				high--;
				break;
			}
		}
		
	}

}
