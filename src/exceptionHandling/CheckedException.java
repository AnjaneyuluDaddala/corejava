package exceptionHandling;

import java.io.FileReader;

public class CheckedException {
	
	private static void readFile(String fileName) {
		
		try {
			FileReader raeder=new FileReader(fileName);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		
      readFile("new.txt");
      System.out.println("main method is leaving---->");
	}

}
