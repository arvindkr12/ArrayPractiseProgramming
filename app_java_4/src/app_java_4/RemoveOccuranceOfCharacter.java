package app_java_4;

public class RemoveOccuranceOfCharacter {

	public static void main(String[] args) {
		System.out.println (remove("abracadabra", 'a'));

	}
	
	public static String remove(String str,char target) {
		if(str==null ||str.isEmpty()) {
			return str;
		}
		
		StringBuilder sb=new StringBuilder();
		
		for(char c:str.toCharArray()) {
			if(c !=target) {
				sb.append(c);
			}
		}
		
		return sb.toString();
	}

}
