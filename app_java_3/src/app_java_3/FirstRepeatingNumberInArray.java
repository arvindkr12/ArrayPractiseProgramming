package app_java_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatingNumberInArray {

	public static void main(String[] args) {
		int[] numbers = {4, 5, 6, 7, 5, 4, 8, 9, 6};
		int firstRepeatingElements = firstRepeatingElements(numbers);
		System.out.println(firstRepeatingElements);

	}
	
	public static int firstRepeatingElements(int numbers[]) {
		 Set<Integer> set=new HashSet<>();
		 
		 for(int num:numbers) {
			 if(set.contains(num)) {
				 return num;
			 }
			 
			 set.add(num);
		 }
		 return 0;
		 
		 
		 
	}
	 
	
	

}
