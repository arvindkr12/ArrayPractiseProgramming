package app_java_3;

public class MaximumAndMinimumElement {

	public static void main(String[] args) {
		int arr[]= {2,4,5,6,8,9,10};
		int largest = largest( arr);
		System.out.println(largest);
	}
	
	public static int largest(int arr[]) {
		int largest = Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}

}
