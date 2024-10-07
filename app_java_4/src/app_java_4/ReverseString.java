package app_java_4;

public class ReverseString {

	public static void main(String[] args) {
String str="abhishek";

 System.out.println(reverse(str));

	}
	
	public static String reverse(String str) {
		StringBuilder sb=new StringBuilder();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		return rev;
	}

}
