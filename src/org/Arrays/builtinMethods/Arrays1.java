package org.Arrays.builtinMethods;

import java.util.Arrays;

public class Arrays1 {

	public static void main(String[] args) {
		int[] grades= {1,2,3,4,5,6,7,8};
		int[] grades1= {1,2,3,4,5,6,7,8};
		
		if(grades==grades1) {
			System.out.println("equal");
		}if(grades.equals(grades1)) {
			System.out.println("equal");
		}
		
		System.out.println(grades+" "+grades1);
		System.out.println(Arrays.toString(grades)+" "+Arrays.toString(grades1));
		
		if(Arrays.equals(grades, grades1)) {
			System.out.println("equal of using Arrays-->");
		}
		
		
		
		int[] grades2 =grades1;
		if(grades2==grades1) {
			System.out.println("equal");
		}if(grades2.equals(grades1)) {
			System.out.println("equal");
		}
		System.out.println(grades2+" "+grades1);
	}

}
