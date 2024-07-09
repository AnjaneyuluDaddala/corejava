
package jdbc_java;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DowhileDynamic {


	
	 static Connection connection=null;

	 
	 
	 static Statement getconnection() throws Exception{
		 
		 Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Vedait","root","Anji@123");
		 
		 Statement st=con.createStatement();
		 return st;
	 }
  
	  
	  static String createqry() {
		  
		  String createqry="create table Vedait.vedait_staff(PersonID int , LastName varchar(223), FirstName varchar(223), Address varchar(223), City varchar(223));";
		  return createqry;
	  }
	  
	  
	  static String insertQry(Facality s) {
		  
		  String insertRecord = "INSERT INTO Vedait.vedait_management " + "(PersonID, LastName, FirstName, Address, City) "
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
	     String continueYN;
	     Statement stmt = getconnection();
	    
	    do{
	    	
	    	System.out.println("1.choose inserting data in the table.");
	    	System.out.println("2.choose updating data in the table.");
	    	System.out.println("3.choose removing  data in the table.");
	    	System.out.println("4.choose romove all data in the table.");
	    	System.out.println("5.choose craeting table in database columns.");
	    	  
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
	    	   break;
	    	case 5:
	    		stmt.execute(createqry());
	    	   break;
	    	default:
	    		System.out.println("Incorrect option ");
	    	}
	    	
	    	System.out.println("Do you wish to continue :Y/N");
			continueYN=sc.next();
	    	
	    }while(continueYN.equalsIgnoreCase("y"));
		System.out.println("congrats you data secure..");
		sc.close();
		connection.close();
	    
	    
	    
	    //stmt.execute(createqry());
	    
	  }
	
   

	}




	


