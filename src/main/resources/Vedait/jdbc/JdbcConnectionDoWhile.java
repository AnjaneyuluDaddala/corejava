package Vedait.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcConnectionDoWhile {

	static Connection con =null;
	
	static Statement DatabaseCon() throws Exception {
		
		String url="jdbc:mysql://localhost:3306/Vedait";
		String user="root";
		String pass="Anji@123";
	    con=DriverManager.getConnection(url, user, pass);
	    System.out.println(con);
		
		Statement st=con.createStatement();
		
		return st;
	}
	
	static String createqry() {
		  
		  String createqry="create table vedait_staff(PersonID int , LastName varchar(223), FirstName varchar(223), Address varchar(223), City varchar(223));";
		  return createqry;
	  }
	
	static String insertQry(Facality s) {

	    String insertRecord = "INSERT INTO vedait_staff " + "(PersonID, LastName, FirstName, Address, City) "
	        + "VALUES (" + s.getPersonId() + ", '" + s.getLastName() + "', '" + s.getFirstName() + "', '"
	        + s.getCity() + "', '" + s.getAddress() + "')";

	    return insertRecord;
	  }
	
	  static Facality provideInput(Scanner sc) {
		  
		  System.out.println("Enter the personid = ");
		  int id=sc.nextInt();
		  System.out.println("Enter the personFirstName = ");
		  String Fname=sc.next();
		  System.out.println("Enter the personLastName = ");
		  String Lname=sc.next();
		  System.out.println("Enter the city = ");
		  String city=sc.next();
		  System.out.println("Enter the Address = ");
		  String address=sc.next();
		  
		  Facality s = new Facality(id, Fname, Lname, city,address);
		 
		
	    return s;
	  }
	  




	public static void main(String[] args) throws Exception {
		
		Scanner sc =new Scanner(System.in);
		String continueYN = "n";
		Statement stmt=DatabaseCon();
		
		do {
			
			System.out.println("1.choose inserting data in the table.");
	    	System.out.println("2.choose updating data in the table.");
	    	System.out.println("3.choose removing  data in the table.");
	    	System.out.println("4.choose romove all data in the table.");
	    	System.out.println("5.create table in in database through columns..");
	    	  
	    	System.out.println();
	    	System.out.println("please choose any one of option-.");
	    	int n=sc.nextInt();
	    	
	    	switch(n) {
	    	case 1:
	    	stmt.execute(insertQry(provideInput(new Scanner(System.in))));
	    	 System.out.println("well! your data is inserted in table.");
	    		break;
	    	case 3:
	    		stmt.execute("dle");
	    	   break;
	    	case 4: 
	    		stmt.execute("truncate table vedait_staff;");
	    		 System.out.println("well! your record are all removed in databse..");
	    	   break;
	    	   
	    	case 5:
	    		stmt.execute("create table vedait_staff(PersonID int,LastName varchar(223),FirstName varchar(223), Address varchar(223),City varchar(223))");
	    		 System.out.println("well! your table is created in databse..");
	    		 break;
	    	   
	    	default:
	    		System.out.println("Incorrect option ");
	    		break;
	    	}
	    	
	    	System.out.println("Do you wish to continue :Y/N");
			continueYN=sc.next();

			
		}while(continueYN.equalsIgnoreCase("y"));
		System.out.println("contrats your data is secure");
		sc.close();
		con.close();
		
	    
	}


	}


