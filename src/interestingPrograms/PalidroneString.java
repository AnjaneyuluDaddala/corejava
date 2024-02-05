package interestingPrograms;

import java.util.Scanner;

public class PalidroneString {

	public static void main(String[] args) {
		//pop,dad,mom,
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String here:-  ");
		String s=sc.next();
		s=s.replace(" ", "");
		String palidroneString="";
	
		
		for(int i=s.length()-1;i>=0;i--) {
			palidroneString+=s.charAt(i);
			System.out.println(palidroneString);
		}
		
		boolean palindrone=true;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=palidroneString.charAt(i)) {
				palindrone=false;
			}
		}
		if(palindrone) {
			System.out.println("True it is palindrone");
		}else {
			System.out.println(" It is not palindrone");
		}

	}

}
