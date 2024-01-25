
package sqlSide;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Employee2Scanner {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the employee id : " );
		int id=sc.nextInt();
		System.out.println("Please enter the employee name : " );
		String  name=sc.next();
		System.out.println("Please enter the employee address : " );
		String address=sc.next();
		
		
		
		String url="jdbc:mysql://localhost:3306/school";
		String user="root";
		String pass="Anji@123";
		Connection con=DriverManager.getConnection(url, user, pass);
		System.out.println("dataBase is connected------"+con);
		System.out.println();
		
		
		Statement st=con.createStatement();
		
		String query="UPDATE school.employee1 SET empName='" + name + "', address='" + address + "' WHERE empid=" + id;
		 String updateQuery = "UPDATE school.employee1 SET empName='" + name + "', address='" + address + "' WHERE empid=" + id;
		 
		
		
		String query1 = "UPDATE school.employee1 SET employee_name = '"+name+"', address = '"+address+"'"
		        + " where employee_id = "+id;
		
		boolean result=st.execute(query);
		System.out.println("it is updated in database:" +result);

	}

}
