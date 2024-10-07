package app_java_3;

import java.util.Arrays;

public class RemovingSpecificElementsinArray {

	public static void main(String[] args) {
		 int[] numbers = {1, 2, 3, 4, 5, 6, 7};
	        int element = 4;
	        int[] removed = getRemoved(numbers,element);
	        
	        System.out.println(Arrays.toString(removed));
	}
	
	public static int[] getRemoved(int arr[],int element) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				count++;
			}
			
		}
		if(count==0) {
			return arr;
		}
		
		int finalised []=new int[arr.length-count];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=element) {
				finalised [index++]=arr[i];
			}
		}
		return finalised;
	}

}
