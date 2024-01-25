package collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
	

	int rollno;
    private static String schoolName;
   //final private static String schoolName;
   //all wrapper classes are static block..it available for all objects..
	
	
	
	Arraylist(int rollNumber,String schoolName){
		this.rollno=rollNumber;
	    // this.setSchoolName(schoolName);
		//this.schoolName=schoolName;
		
	}
	
	static int salary() {
		
		int salary=1000;
		
		return salary ;
	}
	
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Arraylist om1=new Arraylist(11,"narayana school");
		Arraylist om2=new Arraylist(31,"model school");
		
		salary();
		int sal=salary();
		System.out.println(sal);
		
		System.out.println(om1);
		System.out.println(om2);
		
		Arraylist om=new Arraylist(21,"model school");
		schoolName="narayana school";
		System.out.println(om);
		
		
	    List al1=new ArrayList();
		ArrayList al =new ArrayList();
		
		
		int age=19;
		String age1="18";
		
		Integer obj=new Integer(age1);
		Integer  valueOf=obj.valueOf(age1);
		int ageinInt=valueOf.intValue();
		ageinInt++;
		System.out.println(ageinInt);
		
		
		//Integer
		
		
		
		al.add(age);
		
		al.add(age1);
		
		al.add(21);
		al.add(6,19);
		
		// Arraylist is good in searching not inserting and deleting.
		// Linkedlist is good in inserting and deleting bad in searching.
		// load factor is 75% in arraylist.
		
		System.out.println();
		System.out.println(al);

	}


	@Override
	public String toString() {
		return "Arraylist [rollno=" + rollno + ", schoolName=" + getSchoolName() + "]";
	}

	
	//setters and getters

	public static String getSchoolName() {
		return schoolName;
	}


	public static void setSchoolName(String schoolName) {
		Arraylist.schoolName = schoolName;
	}


}
