package app_java_4;

public class CheckDigits {

	public static void main(String[] args) {
		System.out.println(checkDigits("123456"));

	}
	
	public static boolean checkDigits(String str) {
		if(str==null ||str.isEmpty()) {
			return false;
		}
		
		for(char c:str.toCharArray()) {
			if(!Character.isDigit(c)) {
				return false;
			}
		}
		
		return true;
	}

}
