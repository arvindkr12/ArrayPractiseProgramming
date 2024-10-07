package app_java_4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacter2 {

	public static void main(String[] args) {
		 System.out.println(longestSubstring("abcdbcad"));

	}
	
	public static int longestSubstring(String str) {
		 
		Map<Character,Integer> map=new HashMap<>();
		int start=0,length=0;
		
		for(int end=0;end<str.length();end++) {
			
			char c=str.charAt(end);
			if(map.containsKey(c)) {
				if(start<=map.get(c)) {
					start=map.get(c)+1;
				}
			}
			length=Math.max(length, end-start+1);
			map.put(c, end);
		}
		 return length;

}
}
