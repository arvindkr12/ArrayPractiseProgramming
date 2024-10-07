package app_java_3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArraySubsetCheck {

	public static void main(String[] args) {
		int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 1};
        
        System.out.println(subsetCheck(arr1,arr2));;

	}
	
	public static boolean subsetCheck(int arr1 [],int arr2 []) {
//		Set<Integer> set=new HashSet<>();
//		
//		 for(int i=0;i<arr1.length;i++) {
//			 set.add(arr1[i]);
//		 }
		
		 Set<Integer> set = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
		 
		 for(int num:arr2) {
			 if(!set.contains(num)) {
				return false; 
			 }
		 }
		 return true;
	}
	

}
