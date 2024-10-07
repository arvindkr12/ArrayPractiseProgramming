package app_java_3;

import java.util.HashMap;
import java.util.Map;

public class MajorityCountInArray {

	public static void main(String[] args) {
		 int[] nums = {2, 2, 1, 1, 1, 2, 2};
         System.out.println( majority(nums));
	}
	
	
	public static int majority(int arr[]) {
		int majority=arr.length/2;
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int num:arr) {
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}else {
				map.put(num, 1);
			}
			
			if(map.get(num)>majority) {
				return num;
			}
		}
		return 0;
		
	}

}
