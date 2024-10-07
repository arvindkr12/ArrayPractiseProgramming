package app_java_3;

import java.util.HashMap;
import java.util.Map;

public class Count {

	public static void main(String[] args) {
		String input = " Hello Terralogic ";
		input=input.replaceAll(" ","");
		char[] charArray = input.toCharArray();
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(char c:charArray) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
		
		int maxCount=0;
		char ch=' ';
		
		for(Map.Entry<Character, Integer> me:map.entrySet()) {
			if(me.getValue()>maxCount) {
				maxCount=me.getValue();
				ch=me.getKey();
			}
		}
		
		System.out.println("Maximum count is "+maxCount);
		System.out.println("Maximum occuring charchter is"+ch);
	}

}
