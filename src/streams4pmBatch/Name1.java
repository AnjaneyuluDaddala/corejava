package streams4pmBatch;

import java.util.ArrayList;

import predecate.Employee;

public class Name1 {

	public static void main(String[] args) {
		Employee e1=new Employee("Prasanth",23,20000);
		Employee e2=new Employee("Suresh",21,70000);
		Employee e3=new Employee("Satish",24,40000);
		Employee e4=new Employee("Sumanth",22,60000);
		Employee e5=new Employee("Prasanna",31,30000);
		
		ArrayList<Employee>emplist=new ArrayList<>();
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		emplist.add(e5);
		
		System.out.println("Before updation of salary:-"+emplist);
		
		for(Employee emp:emplist) {
			if(emp.getSalary()>30000) {
				emp.setSalary(emp.getSalary()*19);
			}
		}
		
		System.out.println("After updation of salary:- "+emplist);
		

	}

}
