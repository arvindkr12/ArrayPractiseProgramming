package app_java_3;

import java.util.Arrays;

public class RotationOfArrayLeft {

	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 4, 5};
	     int positions = 2; // Number of positions to rotate to left
	     int[] rotation = rotation(arr,positions);
	     
	     System.out.println(Arrays.toString(rotation));
	     

	}
	
	public static int[] rotation(int arr[],int postion) {
		int length=arr.length;
		int rotatedArray[]=new int[length];
		
		for(int i=0;i<length;i++) {
			rotatedArray[i]=arr[(i+postion)%length];
		}
		return rotatedArray;
	}

}
