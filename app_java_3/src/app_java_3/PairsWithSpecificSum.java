package app_java_3;

public class PairsWithSpecificSum {

	public static void main(String[] args) {
		 int[] arr = {2, 4, 3, 5, 7, 8, 1, 9};
	        int target = 10;

	        for(int i=0;i<arr.length;i++) {
	        	for(int j=i+1;j<arr.length;j++) {
	        		if(arr[i]+arr[j]==target) {
	        			System.out.println("("+arr[i]+","+arr[j]+")");
	        		}
	        	}
	        }
	}

}
