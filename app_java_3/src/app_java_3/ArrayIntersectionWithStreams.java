package app_java_3;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayIntersectionWithStreams {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 2, 3, 4};
        int[] array2 = {2, 3, 5, 2};
        int[] intersection = getIntersection( array1, array2);
        System.out.println(Arrays.toString(intersection));
        
         
	}
	
	public static int[] getIntersection(int arr1[],int arr2[]) {
		 Set<Integer> set1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
		 Set<Integer> set2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
		 set1.retainAll(set2);
		 return set1.stream().mapToInt(Integer::intValue).toArray();
		
	}

}
