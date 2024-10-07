package app_java_3;

public class MinimumDistanceBetweenNumbers {

	public static void main(String[] args) {
		int[] arr = {3, 5, 4, 2, 6, 5, 4, 8, 3};
        int x = 3;
        int y = 6;
System.out.println(minimumDistance(arr, x, y));
	}
	
	public static int minimumDistance(int arr[],int x,int y) {
		int minDistance=Integer.MAX_VALUE;
		int lastX=-1;
		int lastY=-1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				lastX=i;
			
			
			if(lastY !=-1) {
				minDistance=Math.min(minDistance, lastX-lastY);
			}
			}else if(arr[i]==y) {
				lastY=i;
				
				if(lastX!=-1) {
					minDistance=Math.min(minDistance, lastY-lastX);
				}
			}
		}
		
		return minDistance;
	}

}
