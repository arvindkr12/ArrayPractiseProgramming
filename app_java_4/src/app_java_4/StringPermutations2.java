package app_java_4;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations2 {

	public static void main(String[] args) {
		String str="ABC"; 
System.out.println(genratePermutations(str));
	}
	
	public static List<String> genratePermutations(String str){
		List<String> list=new ArrayList<>();
		if(str==null ||str.length()==0) {
			return list;
		}
		
		permute(str,"",list);
		return list;
	}

	private static void permute(String str, String prefix, List<String> list) {
		 if(str.length()==0) {
			 list.add(prefix);
		 }else {
			 for(int i=0;i<str.length();i++) {
				char ch= str.charAt(i);
				String remaining=str.substring(0, i)+str.substring(i+1);
				permute(remaining,prefix+ch,list);
			 }
		 }
		
	}
	
	 
}
