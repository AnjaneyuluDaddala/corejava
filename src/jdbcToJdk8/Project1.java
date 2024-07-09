package jdbcToJdk8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Project1{
	 
	ArrayList<Student>  studentList = new ArrayList<Student>();
	
	
	 void getJdbc () throws Exception{
		String url="jdbc:mysql://localhost:3306/student";
		String username="root";
		String password="Anji@123";
		
		
		Connection con=DriverManager.getConnection(url,username,password);
		Statement st=con.createStatement();
		
		

		
	

        // Fetch data from the table
      
		
      	ResultSet resultSet = st.executeQuery("SELECT * FROM student.student");
      	
      	
		
	 
		while(resultSet.next()) {
			
			
			
			 Student s = new Student(resultSet.getInt(2),resultSet.getString(1),resultSet.getInt(4),resultSet.getString(3),resultSet.getInt(4));
			 studentList.add(s);
		    }
		
		
		
		
		
	}

	public static void main(String[] args) throws Exception {
	     
	     Project1 p=new Project1();
	     p.getJdbc();
	    
	     
	     //System.out.println(p.studentList);
	     
	   
	    for(Student student:p.studentList) {
	    	
	    	

		
	    	
	    	

	    	Supplier<String> suplier=()->{ 
	    		
		    	String orginalName=student.getSchoolName().toUpperCase();
		    			 return orginalName;
		    	     	
		    	};
		    	String SchoolName=suplier.get();
		    	
		    	
		    	Function <Student,Integer> function= x->{
		    		
		    		
		    		
		    		int marks=student.getStudentMarks();
		    	
		    		
		    		switch (marks) {
		    		  case 100:
		    			  System.out.println(student.getStudentName().toUpperCase()+" Topper of the state "+student.getStudentMarks()+" "+SchoolName);
		    		    break;
		    		  case 90:
		    		      System.out.println(student.getStudentName().toUpperCase()+" Nice marks "+student.getStudentMarks()+" "+SchoolName);
		    		    break;
		    		  case 80:
		    			  System.out.println(student.getStudentName().toUpperCase()+" good marks "+student.getStudentMarks()+" "+SchoolName);
			    		    break;
		    		  case 70:
		    			  System.out.println(student.getStudentName().toUpperCase()+" try best next time "+student.getStudentMarks()+" "+SchoolName);
			    		    break;
		    		  case 60:
		    			  System.out.println(student.getStudentName().toUpperCase()+" do hard work  "+student.getStudentMarks()+" "+SchoolName);
			    		    break;
		    		  default:
		    		    System.out.println("Not except we wanted guys");
		    		}
		 
		    		
		    	
		    	return x.getRank();
		    	};
		    	int rank=function.apply(student);
		    	System.out.println(rank);
		    
		    	    	
	    }
	
	}

}
