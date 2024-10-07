package app_java_4;

public class SecondOccuranceOfA {

	public static void main(String[] args) {
		 String str = "JAVA PROGRAMMING LANGUAGE";
	        char target = 'A';
System.out.println(getIndex(str,target));
	}
	
	public static int getIndex(String str,char target) { 
		str=str.replaceAll(" ", "");
		int firstIndex=-1;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==target) {
				if(firstIndex==-1) {
					firstIndex=i;
				}else {
					return i;
				}
			}
		}
		
		return -1;
	}
	

}
