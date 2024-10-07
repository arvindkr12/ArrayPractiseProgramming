package app_java_3;

public class EquilibiriumIndex {

	public static void main(String[] args) {
		int[] arr = {-7, 1, 5, 2, -4, 3, 0};
		
    System.out.println(index(arr));
	}
	
	public static int index(int arr[]) { 
		int sum=0;
		int leftSum=0;
		
		for(int i:arr) {
			sum+=i;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(leftSum==sum-leftSum-arr[i]) {
				return i;
			}
			leftSum+=arr[i];
		}
		
		return -1;
	}

}
