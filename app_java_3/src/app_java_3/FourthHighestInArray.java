package app_java_3;

public class FourthHighestInArray {

	public static void main(String[] args) {
		 int[] arr = {-3, 5, 7, 9, -11};
System.out.println(fourthHighest(arr));
	}
	
	public static int fourthHighest(int arr[]) {
		int highest=Integer.MIN_VALUE;
		int secondHighest=Integer.MIN_VALUE;
		int thirdHighest=Integer.MIN_VALUE;
		int fourthHighest=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>highest) {
				fourthHighest=thirdHighest;
				thirdHighest=secondHighest;
				secondHighest=highest;
				highest=arr[i];
			}else if(arr[i]>secondHighest && arr[i]!=highest) {
				fourthHighest=thirdHighest;
				thirdHighest=secondHighest;
				secondHighest=arr[i];
			}else if(arr[i]>thirdHighest && arr[i]!=secondHighest && arr[i]!=highest) {
				fourthHighest=thirdHighest;
				thirdHighest=arr[i];
			}else if(arr[i]>fourthHighest && arr[i]!=thirdHighest && arr[i]!=secondHighest && arr[i]!=highest) {
				fourthHighest=arr[i];
			}
		}
       return fourthHighest;
		
	}

}
