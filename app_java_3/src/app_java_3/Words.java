package app_java_3;

public class Words {

	public static void main(String[] args) {
		String name="Hi My name is Arvind Kumar";
		String[] split = name.split(" ");
		int count = count( split);
		System.out.println(count);

	}
	
	public static int count(String split []) {
		int count=0;
		for(int i=0;i<split.length;i++) {
			
			System.out.println(split[i]);
			count++;
		}
		return count;
	}

}
