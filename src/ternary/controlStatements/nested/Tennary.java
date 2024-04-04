package ternary.controlStatements.nested;

public class Tennary {

	public static void main(String[] args) {
		String str="follow";
		String str1="new";
		
		boolean condition=str.equals(str)?true:false;
		System.out.println(condition);
		
		int condition1=str.equals(str) & str1.equals(str1) ? 4 : 0;
		System.out.println(condition1);
		
		String condition2=str.equals(str) & str1.equals(str1) ? "you are elgible " : "you are not elgible..";
		System.out.println(condition2);
		
		boolean welcome;
		if(str.equals("follow")) {
			welcome=true;
		}else {
			welcome=false;
		}
		
		System.out.println(welcome);
	}

}
