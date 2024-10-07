package app_java_3;

public class OddOccurrenceInArray {

	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 2, 3, 1, 3,3,3,3,3};
		 System.out.println(oddOccurance(arr));
	}
	
	public static int oddOccurance(int arr[]) {
		int result=0;
		
		for(int num:arr) {
			result=result^num;
		}
		
		return result;
	}

}
