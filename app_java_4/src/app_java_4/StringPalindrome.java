package app_java_4;

public class StringPalindrome {

	public static void main(String[] args) {
    String str="madamxx";

   System.out.println( palindrome( str));;
	}
	
	public static boolean palindrome(String str) {
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
		if(rev.equals(str)) {
			return true;
		}else {
			return false;
		}
	}

}
