package app_java_3;

public class MaximumProductSubarray {

	public static void main(String[] args) {
		int[] arr = {2, 3, -2, 4};
		
System.out.println(maxProductSubArray(arr));
	}
	
	public static int maxProductSubArray(int arr[]) {
		if(arr==null ||arr.length==0) {
			return 0;
		}
		
		int maxProduct=arr[0];
		int minProduct=arr[0];
		int result=arr[0];
		
		
		for(int i=1;i<arr.length;i++) {
			int current=arr[i];
			int tempMax=Math.max(current, Math.max(maxProduct*current, minProduct*current));
			minProduct=Math.min(current, Math.min(maxProduct*current, minProduct*current));
			maxProduct=tempMax;
			 // Update the result with the maximum product found so far
            result = Math.max(result, maxProduct);
		}
		
		return result;
	}

}
