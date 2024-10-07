package app_java_4;

public class CountVowelConsonant {

	public static void main(String[] args) {
		 String str="abcdefgh";
		 int vowel=0;
		 int consonant=0;
		 for(int i=0;i<str.length();i++) {
			 if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
				vowel++; 
			 }else {
				 consonant++;
			 }
		 }
System.out.println("Vowel count is "+vowel);
System.out.println("Consonant count is "+consonant);
	}

}
