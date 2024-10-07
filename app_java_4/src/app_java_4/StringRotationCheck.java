package app_java_4;

public class StringRotationCheck {

	public static void main(String[] args) {
		String str1 = "waterbottle";
        String str2 = "erbottlewat";
System.out.println(check(str1,str2));
	}
	
	public static boolean check(String str1,String str2) {
		
		if(str1.length()==str2.length() && str1.length()>1) {
			
			String concatenated=str1+str1;
			
			return concatenated.contains(str2);
		}
		
		return false;
	}

}
