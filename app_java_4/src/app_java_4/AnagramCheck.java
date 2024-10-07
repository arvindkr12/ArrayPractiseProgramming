package app_java_4;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		 String str1 = "listen";
	     String str2 = "silent";
System.out.println(anagramCheck(str1,str2));
	}
	
	public static boolean anagramCheck(String str1,String str2) {
		
		 if(str1.length()!=str2.length()) {
			 return false;
		 }
		 
		 char[] charArray = str1.toCharArray();
		 char[] charArray2 = str2.toCharArray();
		 
		 Arrays.sort(charArray);
		 Arrays.sort(charArray2);
		 return Arrays.equals(charArray, charArray2);
	}

}
