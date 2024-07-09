package batch6Pm;

import java.util.ArrayList;
import java.util.Scanner;

import java.sql.*;





public class UsingStreamsAndCollection {
	
	static String insertQry(Student s) {

	    String insertRecord = "INSERT INTO school.VedaitStudents " + "(studentid,studentname,schoolname,marks,course) "
	        + "VALUES (" + s.getId() + ", '" + s.getName()+ "', '" + s.getSchoolName() + "', "
	        + s.getMarks() + ", '" + s.getCourse() + "')";

	    return insertRecord;
	  }
	
	
	  static Student provideInput(Scanner sc) throws Exception{
		  
		  System.out.println("Enter the Studentid = ");
		  int id=sc.nextInt();
		  System.out.println("Enter the StudentName = ");
		  String name=sc.next();
		  System.out.println("Enter the SchoolName = ");
		  String Sname=sc.next();
		  System.out.println("Enter the marks = ");
		  double marks=sc.nextDouble();
		  System.out.println("Enter the name of course = ");
		  String course=sc.next();
		  
		  
		 Student s = new Student(id, name ,Sname, marks,course);
	    
		 ArrayList<Student> list=new ArrayList<>();
		 list.add(s);
		 
		 for(Student s1:list) {
			String insertRecord="INSERT INTO school.VedaitStudents " + "(studentid,studentname,schoolname,marks,course) "
        	        + "VALUES (" + s1.getId() + ", '" + s1.getName()+ "', '" + s1.getSchoolName() + "', "
        	  
        	        + s1.getMarks() + ", '" + s1.getCourse() + "')";
		
			PreparedStatement pst=StaticMethodJdbc.getPreparestatement(insertRecord);
			pst.execute();
			
		 
		 }
		 
		 
		 return s;
	  }

	public static void main(String[] args) throws Exception{   
	    String continueYN="n";
		Scanner sc=new Scanner(System.in);
	
		do {
			
			System.out.println("1.choose inserting data in the table.");
	    	System.out.println("2.choose updating data in the table.");
	    	System.out.println("3.choose removing  data in the table.");
	    	System.out.println("4.choose romove all data in the table.");
	    	
	    	
	    	System.out.println();
	    	System.out.println("please choose any one of option-.");
	    
			
			
			System.out.println("Do you to continue-Y/N");
			continueYN=sc.next();
			
		}while(continueYN.equalsIgnoreCase("y"));
		System.out.println("Have a nice day sir///");
		System.out.println("Your data is secure...");
		sc.close();
	
		//callable is used java will give 1 lakh records to mysql ,database will insert one by one.
        // storeProcedure 
		//reduces the backend-communication,performance increases.
	}

}
