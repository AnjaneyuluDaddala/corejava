package array;

public class Array1 {
	
	void m1(int arr[]) {
		
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
				System.out.println("The minimum number is ="+ min);
			}
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int arr[]= {12,89,9,78};
		
		Array1 ar=new Array1();
		ar.m1(arr);
		
	}

}
