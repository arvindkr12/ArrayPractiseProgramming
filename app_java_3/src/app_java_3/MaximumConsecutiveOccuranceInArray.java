package app_java_3;

public class MaximumConsecutiveOccuranceInArray {

	public static void main(String[] args) {
		int arr[]= {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
		int element=1;
        System.out.println(consecutive(arr,element));
	}
	
	public static int consecutive(int arr[],int element) {
		 int count=0;
		 int maxCount=0;
		 
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]==element) {
				 count++;
				 maxCount=Math.max(count, maxCount);
			 }else {
				 count=0;
			 }
		 }
	return maxCount;

}
}
