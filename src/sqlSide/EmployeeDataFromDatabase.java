package sqlSide;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDataFromDatabase {
  
  int empId;
  String name;
  String empAddress;
  
  
  
  public EmployeeDataFromDatabase(int empId, String name, String empAddress) {
    this.empId = empId;
    this.name = name;
    this.empAddress = empAddress;
  }

  public EmployeeDataFromDatabase() {}
  
  void setEmployeeDetails(){
    EmployeeDataFromDatabase e1 = new EmployeeDataFromDatabase(121,"Name1","Address1");
    EmployeeDataFromDatabase e2 = new EmployeeDataFromDatabase(122,"Name2","Address2");
    EmployeeDataFromDatabase e3 = new EmployeeDataFromDatabase(123,"Name3","Address3");
  }

  public static void main(String[] args) throws Exception{
	  EmployeeDataFromDatabase emp =new EmployeeDataFromDatabase();
	  emp.setEmployeeDetails();
	  
	  
	  
        String url="jdbc:mysql://localhost:3306/school";
    Connection con = DriverManager.getConnection(url, "root", "Anji@123");
    System.out.println("Is connected to DB ?"+con);
    
    Statement statement = con.createStatement();
    
    ResultSet resultSet = statement.executeQuery("SELECT * FROM school.student");
    
    while(resultSet.next()) {
      System.out.print(resultSet.getString(1)+" "+resultSet.getInt(2)+" "+resultSet.getInt(3)+" "+resultSet.getDouble(4));
      System.out.println();
    }    
    
  }

}