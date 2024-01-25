
package sqlSide;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class Employee3setget {

	
	void sqlDemand(SetAndGet set) throws Exception {
		
		  String url="jdbc:mysql://localhost:3306/school";
		  String user="root";
		  String password="Anji@123";
		  
		  
		  Connection con =DriverManager.getConnection(url, user, password);
		  
		  Statement st=con.createStatement();
		  
		  
		  String query ="INSERT INTO bookmanagement.employee (employee_id, employee_name, address)"
			        + "VALUES (121, 'VedaIT', 'JNTU X Roads');";
		  
		  
		  String query2="insert into school.employee1(empid,empName,empAge,address) "+ " values(?,?,?,?)";
		
		  
		  String query3="insert into school.employee1 values(?,?,?,?)";
		  
		  PreparedStatement ps=con.prepareStatement(query2);
		  
           ps.setInt(1,set.getEmpid() );
           ps.setString(2,set.getEmpName());
           ps.setInt(3,set.getEmpAge());
           ps.setString(4,set.getAddress());
        
		System.out.println("query2 =  "+query2);
        
        int response=ps.executeUpdate();
        
        
		ResultSet resultSet = st.executeQuery("SELECT * FROM school.student");
		while(resultSet.next()) {
		      System.out.print(resultSet.getString(1)+" "+resultSet.getInt(2)+" "+resultSet.getInt(3)+" "+resultSet.getDouble(4));
		      System.out.println();
		    } 
		

        
       
        
       
	}
	public static void main(String[] args) throws Exception {
		SetAndGet set=new SetAndGet(1,"anjan",23,"hyd");
		Employee3setget empla=new Employee3setget();
		empla.sqlDemand(set);
		
			 

	}

}
