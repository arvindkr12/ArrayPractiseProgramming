package app_java_4;

public class StringCompresser {

	public static void main(String[] args) {
		 String str = "aabcccccaaa";
		 System.out.println(compress(str));

	}
	
	public static String compress(String str) {
		
		if(str==null ||str.isEmpty()) {
			return "";
		}
		
		StringBuilder sb=new StringBuilder();
		int count=1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(i-1)) {
				count++;
			}else {
				sb.append(str.charAt(i-1)).append(count);
				count=1;
			}
		}
		
		//for last character
		sb.append(str.charAt(str.length()-1)).append(count);
		String result=sb.toString();
		return result.length()<str.length() ? result:str;
	}

}
