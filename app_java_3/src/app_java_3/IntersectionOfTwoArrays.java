package app_java_3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 2, 3, 4};
        int[] array2 = {2, 3, 5, 2};
        int[] intersection = getIntersection(array1,array2);
        System.out.println(Arrays.toString(intersection));
	}
	
	public static int[] getIntersection(int arr1[],int arr2[]) {
		
		Set<Integer>set=new HashSet<>();
		Set<Integer>intersect=new HashSet<>();
		
		for(int a:arr1) {
			set.add(a);
		}
		
		for(int num:arr2) {
			if(set.contains(num)) {
				intersect.add(num);
			}
		}
		
		int coomon[]=new int[intersect.size()];
		int j=0;
		for(int i:intersect) {
			coomon[j++]=i;
		}
		return coomon;
		
	}

}
