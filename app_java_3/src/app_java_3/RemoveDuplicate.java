package app_java_3;

import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,8,5,4,3,2,1};
		
		HashSet<Integer> set=new HashSet<>();
		for(int i:arr) {
			set.add(i);
		}
		
		for(int x:set) {
			System.out.println(x);
		}

	}

}
