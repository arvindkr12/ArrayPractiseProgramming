package app_java_4;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachcharacter {

	public static void main(String[] args) {
		String str="abcxbvxxvxxvsgdhejmsjdbxxxx";
		
		Map<Character,Integer> map=new HashMap<>();
		
		str=str.replaceAll(" ", "");
		char[] charArray = str.toCharArray();
		
		for(char c:charArray) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		int maxValue=0;
		char c=' ';
		
		for(Map.Entry<Character, Integer> me:map.entrySet()) {
			if(me.getValue()>maxValue) {
				maxValue=me.getValue();
				c=me.getKey();
			}
		}
		System.out.println(map);
        System.out.println(maxValue);
        System.out.println(c);
	}

}
