package app_java_3;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfElement {

	public static void main(String[] args) {
		int[] array = {4, 2, 2, 8, 3, 3, 3, 1, 4, 4};
		
		Map<Integer, Long> collect = Arrays.stream(array).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        collect.forEach((key,value)->{
        	if(value>1) {
        		System.out.print("element"+key);
            	System.out.print("Value "+value);
            	System.out.println();
        	}
        	
        });
	}

}
