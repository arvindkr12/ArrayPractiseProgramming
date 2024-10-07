package app_java_4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacterInStringUsingJava8 {
//with the help of java 8 features
	public static void main(String[] args) {
     String str="swiss";
	System.out.println(firstNonRepeated(str));
	}
	
	public static char firstNonRepeated(String str) {
		LinkedHashMap<Character, Long> collect = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	
	   return collect.entrySet().stream().filter(entry->entry.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);
	}

}
