package app_java_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingNumberInArray {

	public static void main(String[] args) {
		int[] numbers = {4, 5, 6, 7, 5, 4, 8, 9, 6};
		int firstNonRepeatingElements = firstNonRepeatingElements(numbers);
        System.out.println(firstNonRepeatingElements);
	}
	
	public static int firstNonRepeatingElements(int numbers[]) {
		 
		 Map<Integer,Integer> map=new HashMap<>();
		 
//		 for(int num:numbers) {
//			 if(map.containsKey(num)) {
//				 map.put(num, map.get(num)+1);
//			 }else {
//				 map.put(num, 1);
//			 }
//		 }
		 Map<Integer, Long> collect = Arrays.stream(numbers).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		  
		 for(int num:numbers) {
			 if(collect.get(num)==1) {
				 return num;
			 }
		 }
		 
		 return 0;
	}
	
	

}
