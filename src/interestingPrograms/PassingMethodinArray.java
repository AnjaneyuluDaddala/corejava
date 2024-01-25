package interestingPrograms;

public class PassingMethodinArray {
	
	static void array1(int arr[]) {
		/*
		 * int min=arr[0];  
           for(int i=1;i<arr.length;i++)  
           if(min>arr[i])  
           min=arr[i];  
  
           System.out.println(min);  
}  
		 */
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {12,34,56,34};
		array1(arr);

	}

}
