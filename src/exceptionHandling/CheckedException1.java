package exceptionHandling;

import java.io.FileReader;

public class CheckedException1 {
	
	
private static void readFile(String fileName) throws Exception {
		
		
			FileReader raeder=new FileReader(fileName);

		
	}

	public static void main(String[] args) throws Exception{
		
		
		try {
			readFile("new.txt");
		}catch(Exception e) {
			System.out.println("sorry, the file is not existed--->");
		}
      
      
      
      System.out.println("main method is leaving---->");
      
	}

}
