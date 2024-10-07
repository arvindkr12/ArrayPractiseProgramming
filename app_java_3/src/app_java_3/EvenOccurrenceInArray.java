package app_java_3;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EvenOccurrenceInArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 3, 1, 4, 4, 4, 4};
		Map<Integer, Long> collect = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(collect);
		collect.forEach((key,value)->{
        	if(value>2) {
        		System.out.println(key);
        		 
        	}
        });
	}

}
