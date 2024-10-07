package app_java_3;

import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {

	public static void main(String[] args) {
		int[] numbers = {5, 3, 8, 1, 9, 2};
		
//		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]<numbers[j]) {
					int temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
					
				}
			}
		}
		
		System.out.println("Second largest elements:"+numbers[1]);
		System.out.println(Arrays.toString(numbers));
	}

}
