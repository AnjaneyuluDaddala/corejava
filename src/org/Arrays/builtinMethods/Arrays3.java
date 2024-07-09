package org.Arrays.builtinMethods;

import java.util.Arrays;

public class Arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {23,45,78,1,34};
         System.out.println(arr[0]);
         System.out.println(arr[1]);
         System.out.println(arr[2]);
         Arrays.sort(arr);
         System.out.println(Arrays.toString(arr));
         
         for(int i:arr) {
        	 System.out.println(i);
         }
	}

}
