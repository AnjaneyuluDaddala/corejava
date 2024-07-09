package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ArrayException {

	public static void main(String[] args) {
		  try  
	        {  
	        int arr[]= {1,3,5,7};  
	        System.out.println(arr[10]); //may throw exception   
	        }  
	            // handling the array exception  
	        catch(ArrayIndexOutOfBoundsException e)  
	        {  
	            System.out.println(e);  
	        }  
	        System.out.println("rest of the code");  
	        
	        
	        
	        PrintWriter pw;  
	        try {  
	            pw = new PrintWriter("jtp.txt"); //may throw exception   
	            pw.println("saved");  
	        }  
	// providing the checked exception handler  
	 catch (FileNotFoundException e) {  
	              
	            System.out.println(e);  
	        }         
	    System.out.println("File saved successfully");      
	        
	    }  
	      
	

	}


