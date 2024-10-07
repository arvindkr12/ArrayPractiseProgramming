package app_java_3;

public class KadansCalculation {

	public static void main(String[] args) {
		// maxm sum of array
		
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		kadanes(nums);
	}
	
	public static void kadanes(int arr[]) {
		int ms=Integer.MIN_VALUE;
		int cs=0;
		
		for(int i=0;i<arr.length;i++) {
			cs=cs+arr[i];
			
			if(cs<0) {
				cs=0;
			}
			
			ms = Math.max(cs, ms);
		}
		
		System.out.println("Maximum subarray sum is:"+ms);
	}

}
