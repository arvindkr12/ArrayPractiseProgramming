package app_java_3;

public class BinarySearchExample {

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 7;
int search = search(arr,target);
System.out.println(search);
        
	}
	
	public static int search(int arr[],int target) {
		 int start=0;
		 int end=arr.length-1;
		 
		 while(start<=end) {
			 int mid=(start+end)/2;
			 
			 if(arr[mid]==target) {
				 return mid;
			 }
			 
			 if(arr[mid]<target) {
				 start=mid+1;
			 }else {
				 end=mid-1;
			 }
		 }
		 
		 return -1;
	}

}
