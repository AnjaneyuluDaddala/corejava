package sqlSide;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee1NotusingGetSet {
	
	int empid;
	String empName;
	int empAge;
	String address;
	
	Employee1NotusingGetSet(){
		
	}
	
       Employee1NotusingGetSet(int empid, String empName, int empAge, String address) {
		
		this.empid = empid;
		this.empName = empName;
		this.empAge = empAge;
		this.address = address;
	}
	void display() throws Exception  {
		String url="jdbc:mysql://localhost:3306/school";
		String user="root";
		String pass="Anji@123";
		Connection con=DriverManager.getConnection(url,user,pass);
		Statement st=con.createStatement();
		
		String query="insert into school.employee1 values(?,?,?,?);";
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setInt(1, this.empid);
		ps.setString(2, this.empName);
		ps.setInt(3, this.empAge);
		ps.setString(4, this.address);
		
		System.out.println("it is inserted dynamically "+query);
		int response=ps.executeUpdate();
		
	}

	public static void main(String[] args) throws Exception {
		 Employee1NotusingGetSet emp1 = new Employee1NotusingGetSet(12,"Ram",23,"hyd");
		 Employee1NotusingGetSet emp2 = new Employee1NotusingGetSet(13,"Anil",34,"pune");
		 Employee1NotusingGetSet emp3 = new Employee1NotusingGetSet(14,"mounik",24,"delhi");
		 
		// Employee1 el =new Employee1();
		 emp1.display();
		 emp2.display();
		 emp3.display();
	}
	

}
