package batch6Pm;

import java.util.ArrayList;
import java.util.*;


import jdbc.Employee;

public class NotUsingStream {

	public static void main(String[] args) {
		
		Employee emp1=new Employee(12,"Sampath",20000.0,"Pharmacy");
		Employee emp2=new Employee(11,"Sai",10000.0,"Mechanic");
		Employee emp3=new Employee(15,"Koushik",30000.0,"Manager");
		Employee emp4=new Employee(23,"Anjan",80000.0,"CEO");
		
		
		
		List<Employee> emplist=new ArrayList<Employee>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		List<Employee> list=new ArrayList<Employee>();
		Set<Employee> set= new HashSet<>();
		
		for(Employee emp:emplist) {
			if(emp.getEname().startsWith("S")) {
				
				list.add(emp);
			}
			else {
				set.add(emp);
			}
			
		}
	System.out.println(emplist);
	System.out.println(list);
	System.out.println(set);
	
	    
		
	}

}
