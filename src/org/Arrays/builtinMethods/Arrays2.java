package org.Arrays.builtinMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays2 {

	public static void main(String[] args) {
		int[] marks= {1,2,3,4,5,6,7,8};
		Arrays.fill(marks, 20);
		System.out.println(Arrays.toString(marks));
		
		
		String[] names=new String[5];
		Arrays.fill(names, " ");
		System.out.println(Arrays.toString(names));
		
		
		
		List<String> testing =Arrays.asList(names);
		try {
			
		testing.add("nanna");
		testing.add("uncle");
		testing.add("nanna");
		testing.add("uncle");
		testing.add("nanna");
		testing.add("uncle");
		testing.add("nanna");
		testing.add("uncle");
		
			System.out.println(testing);
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		List<String> testing1 =new ArrayList<>(Arrays.asList(names));
		testing1.add(0,"uncle");
		testing1.add("nanna");
		testing1.add("uncle");
		testing1.add("nanna");
		testing1.add("uncle");
		testing1.add("nanna");
		testing1.add("uncle");
		System.out.println(testing1);
		
	}

}
