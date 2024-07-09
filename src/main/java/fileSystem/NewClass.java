package fileSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NewClass {
	
	 // creating file
	public static void createFile(File file)throws IOException  {
		
		  if(file.createNewFile()) {
			  System.out.println("File is created...!"+file.getName()); 
		  }else {
			  System.out.println("file is already exists= "+file.getName());
		  }
		
	}
	
	//writing file
    public static void writingFile(FileWriter file) throws IOException{
        file.write("This is some text placed here!");
        file.close();
        System.out.println("successfully written");
	
 }
    //reading file
    public static void  readFile(File file) throws FileNotFoundException{
    	Scanner sc=new Scanner(file);
    	while(sc.hasNextLine()) {
    		String data=sc.nextLine();
    		System.out.println(data);
    	}
    	sc.close();
    	
    }
    
    //deleting file
    
    public static void deleteFile(File file) {
    	 if (file.delete()) {
             System.out.println("File deleted: " + file.getName());
         } else {
             System.out.println("File does not exist.");
         }
    }

	  public static void main(String[] args) {
		  try {
			  createFile(new File("new.txt"));
			  writingFile(new FileWriter("new.txt"));
		  }catch(IOException e) {
			  e.printStackTrace();
			  
		  }
		  
		  //reading file
		
		  try {
			  readFile(new File("new.txt"));
		  }catch(FileNotFoundException e) {
			  System.out.println("an error is occured!");
			  e.printStackTrace();
			  
		  }
		  
		  //deleting file
		  deleteFile(new File("p2.txt"));
		 
	       
	    }
}


