package app_java_3;

import java.util.Arrays;

public class MergeOfTwoArrays {
public static void main(String[] args) {
	 int[] arr1 = {1, 2, 3, 4, 5};
     int[] arr2 = {6, 7, 8, 9, 10};
     int[] merge = merge(arr1,arr2);
     
     System.out.println(Arrays.toString(merge));
     
}

public static int[] merge(int arr1 [],int arr2 []) {
	int length1=arr1.length;
	int length2=arr2.length;
	int mergeArray[]=new int[length1+length2];
	System.arraycopy(arr1, 0, mergeArray, 0, length1);
	System.arraycopy(arr2, 0, mergeArray, length1, length2);
	return mergeArray;
}
}
