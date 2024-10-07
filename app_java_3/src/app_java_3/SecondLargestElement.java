package app_java_3;

public class SecondLargestElement {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
System.out.println(arr[1]);
	}

}
