package app_java_3;

import java.util.ArrayList;
import java.util.List;

public class SeperateEvenOddNumbers {

	public static void main(String[] args) {
		int[] numbers = {12, 17, 19, 20, 24, 15, 30, 21, 28};
		List<List<Integer>> seperated = seperated(numbers);
		
		System.out.println(seperated.get(0));
		System.out.println(seperated.get(1));
	}
	
	public static List<List<Integer>> seperated(int arr[]){
		
		List<Integer> even=new ArrayList<>();
		List<Integer> odd=new ArrayList<>();
		
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]%2==0) {
				 even.add(arr[i]);
			 }else {
				 odd.add(arr[i]);
			 }
		 }
		
		List<List<Integer>> list=new ArrayList<>();
		list.add(even);
		list.add(odd);
		
		return list;
	}

}
