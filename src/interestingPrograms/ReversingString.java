package interestingPrograms;

public class ReversingString {

	public static void main(String[] args) {
		  String str= "sachin"; String str1="";
	        char ch;
	       
	      System.out.print("Original word: ");
	      System.out.println("sachin"); //Example word
	       
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); //extracts each character
	        str1= ch+str1; //adds each character in front of the existing string
	      }
	      System.out.println("Reversed word: "+ str1);
	    }
	

	}


