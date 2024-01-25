package sqlcodes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
	
	int empid;
	String name;
	String place;
	
   public Employee(int empid, String name, String place) {
		
		this.empid = empid;
		this.name = name;
		this.place = place;
	}
	
	
	void display() {
		Employee emp=new Employee(21,"hari","hyd");
		Employee emp1=new Employee(21,"hari","hyd");
		Employee emp2=new Employee(21,"hari","hyd");
	}


	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 // JDBC URL, username, and password of SQL Server
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
		String url = "jdbc:sqlserver://localhost:1433;databaseName=school";
       
        String user = "LENOVO\\Derrick";
        String password = "1234";

		try {
			try (Connection con=DriverManager.getConnection(url,user,password)){
				
				System.out.println("connection is established");
			}
			
		}
		catch(SQLException e){
			System.out.println("error connection is displayed");
			e.printStackTrace();
		}

   }
}
