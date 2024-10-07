package app_java_3;

import java.util.Arrays;

public class MoveZeroAtEnd {

	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 3, 12};
		int[] moveZeroAtEnd = moveZeroAtEnd(arr);
		System.out.println(Arrays.toString(moveZeroAtEnd));

	}
	public static int[] moveZeroAtEnd(int arr[]) {
		int length=arr.length;
		int nonZeroIndex=0;
		
		for(int i=0;i<length;i++) {
			if(arr[i]!=0) {
				arr[nonZeroIndex++]=arr[i];
			}
		}
		
		while(nonZeroIndex<length) {
			arr[nonZeroIndex++]=0;
		}
		return arr;
	}

}
