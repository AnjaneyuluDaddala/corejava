package batch6Pm;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class RefrenceOfStatementPrepared {

	public static void main(String[] args) throws Exception {
		String qry="insert";
		PreparedStatement pst=StaticMethodJdbc.getPreparestatement(qry);
		String qry1="select";
       ResultSet  rs= pst.executeQuery(qry1);
		
	    ArrayList<Student>studentList=new ArrayList<>();
	    
	    while(rs.next()) {
//			 System.out.println("Student id= "+rs.getInt(1));
//			 System.out.println("Student name= "+rs.getString(2));
//			 System.out.println("Student school name= "+rs.getString(3));
//			 System.out.println("Student marks= "+rs.getInt(4));
//			 System.out.println("Student name of course= "+rs.getString(5));
//			// System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3)+rs.getInt(4)+rs.getString(4));
		
		 Student s=new Student(rs.getInt("studentid"),rs.getString("studentname"),rs.getString("schoolname"),rs.getInt("marks"),rs.getString("course"));
		 studentList.add(s);
		 }
		System.out.println("In using PreparedStatement---->" + studentList);
		
		
		
		
		
		Statement stmt=(Statement) StaticMethodJdbc.getConnectionjbc();
	    ResultSet  rs1= stmt.executeQuery("select * from school.VedaitStudents ");
		
	    ArrayList<Student>studentList1=new ArrayList<>();
	    
	    while(rs1.next()) {
//			 System.out.println("Student id= "+rs.getInt(1));
//			 System.out.println("Student name= "+rs.getString(2));
//			 System.out.println("Student school name= "+rs.getString(3));
//			 System.out.println("Student marks= "+rs.getInt(4));
//			 System.out.println("Student name of course= "+rs.getString(5));
//			// System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3)+rs.getInt(4)+rs.getString(4));
		
		 Student s=new Student(rs1.getInt("studentid"),rs1.getString("studentname"),rs1.getString("schoolname"),rs1.getInt("marks"),rs1.getString("course"));
		 studentList1.add(s);
		 }
	    
	    System.out.println("In using Statement---->" + studentList1);
	    
	    

	}

}
