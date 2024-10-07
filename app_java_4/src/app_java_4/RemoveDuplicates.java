package app_java_4;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		 System.out.println(removeDuplicates("abracadabra"));

	}
	
	public static String removeDuplicates(String str) {
		if(str==null ||str.isEmpty()) {
			return str;
		}
		
		Set<Character> set=new HashSet<>();
		StringBuilder sb=new StringBuilder();
		
	for(char c:str.toCharArray()) {
		if(!set.contains(c)) {
			set.add(c);
			sb=sb.append(c);
		}
	}
	return sb.toString();}
	}


