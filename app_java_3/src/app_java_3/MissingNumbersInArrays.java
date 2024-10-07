package app_java_3;

public class MissingNumbersInArrays {

	public static void main(String[] args) {
		 int[] arr = {1, 2, 4, 6, 3, 7, 8};
		 
		 int n=arr.length+1;
		 
		 int expectedSum=(n*(n+1))/2;
		 
		 int actualSum=0;
		 
		 for(int num:arr) {
			 actualSum+=num;
		 }
		 
		 int missingNumber=expectedSum-actualSum;
		 System.out.println(missingNumber);
	}

}
