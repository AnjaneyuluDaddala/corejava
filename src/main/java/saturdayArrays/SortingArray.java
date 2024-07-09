package saturdayArrays;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		int[] array={21,1,67,90};
		
		Arrays.sort(array);
		
		for(int i=0;i<array.length;i++) {
			System.out.println("array["+"i] = "+array[i]);
			
		}
		
	}

}
