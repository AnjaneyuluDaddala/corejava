package batch6Pm;
import java.sql.*;

import com.mysql.cj.protocol.Resultset;



public class StaticMethodJdbc {
	static Connection getconobj=null;
	
	
	static Statement getConnectionjbc() throws Exception {
		
	    getconobj=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Anji@123");
		Statement stmt=getconobj.createStatement();
		return stmt;
		
	}
	
	static PreparedStatement getPreparestatement(String qry) throws Exception{
		getconobj=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","Anji@123");
		PreparedStatement ps=getconobj.prepareStatement(qry);
		return ps;
	}
 
}
