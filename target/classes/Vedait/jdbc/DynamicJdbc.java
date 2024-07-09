package Vedait.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DynamicJdbc {
	
	 static Connection con=null;
	 
	 
	static Connection DatabaseCon() throws Exception {
		
		String url="jdbc:mysql://localhost:3306/school";
		String user="root";
		String pass="Anji@123";
		Connection con=DriverManager.getConnection(url, user, pass);
		System.out.println(con);
		return con;
	}
	
   static Statement DatabaseStatement() throws Exception{
	   
	     Statement st=con.createStatement();
	      return st;
   }
   
   static PreparedStatement DatabasePrepare(String f) throws Exception {
	   
	   
	   PreparedStatement pre=con.prepareStatement(f);
	   
	   return pre;
   }
   
   
   
   public static void main(String[] args) throws Exception {
	DatabaseCon();
}
/*
 *  
 */
}
