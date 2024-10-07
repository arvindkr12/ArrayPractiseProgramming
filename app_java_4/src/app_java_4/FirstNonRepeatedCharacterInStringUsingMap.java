package app_java_4;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacterInStringUsingMap {

	public static void main(String[] args) {
		String str="swiss";
System.out.println(getFirstNonRepeatetiveCharacter(str));
	}
	
	public static char getFirstNonRepeatetiveCharacter(String str) {
		Map<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		char[] charArray = str.toCharArray();
		
		for(char c:charArray) {
			if(map.get(c)==1) {
				return c;
			}
		}
		return ' ';
	}

}
