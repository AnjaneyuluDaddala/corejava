package batch6Pm;

import java.sql.*;
import java.util.ArrayList;

public class Refrence {

	public static void main(String[] args) throws Exception{
		Statement statement = StaticMethodJdbc.getConnectionjbc();
        Student st1=new Student();
        Student st2=new Student();
        
        ArrayList<Student> list=new ArrayList<>();
        
        list.add(st1);
        list.add(st2);
        
        for(Student s:list) {
        	
        	String insertRecord = "INSERT INTO school.VedaitStudents " + "(studentid,studentname,schoolname,marks,course) "
        	        + "VALUES (" + s.getId() + ", '" + s.getName()+ "', '" + s.getSchoolName() + "', "
        	        + s.getMarks() + ", '" + s.getCourse() + "')";
        	
        	statement.execute(insertRecord);
        }
        
        StaticMethodJdbc.getconobj.close();
       
        //preparedStatememt is passing ..pass only once used in preparedStatement.
	}

}
