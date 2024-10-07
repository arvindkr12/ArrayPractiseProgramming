package app_java_3;

import java.util.Arrays;

public class RotationOfArrayRight {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
        int positions = 2; // Number of positions to rotate right
        int[] rotateright = rotateright(array,positions);
        System.out.println(Arrays.toString(rotateright));
	}
	
	public static int[] rotateright(int arr[],int position) {
		int length=arr.length;
		int rotatedArray[]=new int[length];
		
		for(int i=0;i<length;i++) {
			rotatedArray[(i+position)%length]=arr[i];
		}
		
		return rotatedArray;
	}

}
