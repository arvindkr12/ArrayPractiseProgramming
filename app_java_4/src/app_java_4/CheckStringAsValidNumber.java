package app_java_4;

public class CheckStringAsValidNumber {

	public static void main(String[] args) {
		System.out.println(valid("123.45"));
		System.out.println(valid("123abc"));

	}
	
	public static boolean valid(String str) {
		
		if(str==null || str.length()==0) {
			return true;
		}
		try {
			Double.parseDouble(str);
			return true;
		}catch(NumberFormatException ex) {
			return false;
		}
		
	}

}
