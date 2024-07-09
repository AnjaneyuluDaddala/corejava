package Vedait.jdbc;
import java.sql.*;
import java.util.Scanner;

public class Jdbc4pmClass {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		String continueyn="n";
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Vedait", "root", "Anji@123");
		
		Statement stmt=con.createStatement();
		
		
		do{
			
			System.out.println("Welcome ,JDBC CONNECTION TO JAVA");
			System.out.println("Choose any option below -->");
			System.out.println("1.Inserting data into the database...");
			System.out.println("2.Updating data in the database.");
			System.out.println("3.Removing all records in the database.");
			
		   int n=sc.nextInt();
		   
		   int studentid;
		   
			switch(n) {
			
			case 1:
				System.out.println("Welcome ,to inserting data");
				System.out.println("Please enter the details---------->");
				System.out.println("Enter the student id= ");
			    studentid=sc.nextInt();
				System.out.println("Enter the student name= ");
				String studentname=sc.next();
				System.out.println("Enter the student of class= ");
				String studentClass=sc.next();
				System.out.println("Enter the student Address= ");
				String studentAddress=sc.next();
				stmt.execute("insert into student(sid,sname,class,address)"+ " values("+studentid+",'"+studentname+"','"+studentClass+"','"+studentAddress+"')");
				System.out.println("Your data is inserted in database............ ");
			
				break;
				
			case 2:
				int studentid1;
				
				System.out.println("1.changing the studentId in record ");
				System.out.println("2.changing the studentName in record ");
				System.out.println("3.changing the studentClass in record ");
				System.out.println("4.changing the studentAddress in record ");
				System.out.println();
				System.out.println("Please enter the option here ---->");
				
				n=sc.nextInt();
				System.out.println("Please enter the Studentid of record you wnat to change..> = ");
			    studentid1=sc.nextInt();
				
				switch(n) {
				case 1:
				 System.out.println("Enter the new StudentId to replace of old StudentId");
				 int id=sc.nextInt();
				 stmt.executeUpdate("update Vedait.student set sid= "+id+" where sid= "+studentid1+"");
				 break;
				case 2:
					 System.out.println("Enter the new Studentname");
					 String name=sc.next();
					 stmt.executeUpdate("update Vedait.student set sname= '"+name+"' where sid= "+studentid1+"");
					 break;
				case 3:
					 System.out.println("Enter the new StudentClass");
					 String class1=sc.next();
					 stmt.executeUpdate("update Vedait.student set class= '"+class1+"' where sid= "+studentid1+"");
					 break;
				case 4:
					 System.out.println("Enter the new StudentClass");
					 String address=sc.next();
					 stmt.executeUpdate("update Vedait.student set address= '"+address+"' where sid= "+studentid1+"");
					 break;
			   default:
				    System.out.println("Please enter the correct option..");
				    break;	 
						 
				}
				
				break ;
				
			default:
				System.out.println("Please choose correct option=====>");
				
				break;		
			}
			
			System.out.println("Do you wish to continue -->Y/N");
			continueyn=sc.next();
		}while(continueyn.equalsIgnoreCase("y"));
		System.out.println("Your data is Secure->>>>>");
		System.out.println("Have a nice day,sir/madam====>");
		sc.close();
		con.close();
			

	}

}
