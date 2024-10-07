package app_java_3;

import java.util.Arrays;
import java.util.List;

public class TargetElement {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7,8,9};
	int target=7;
	boolean findElement = findElement(arr,target);
	System.out.println(findElement);
	
	boolean anyMatch = Arrays.stream(arr).anyMatch(element->element==target);
	System.out.println(anyMatch);
}

public static boolean findElement(int arr[],int target) {
	 
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==target) {
			return true;
		} 
	}
	return false;
}
}
