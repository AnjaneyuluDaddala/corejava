package predecate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Class7thdate {

	public static void main(String[] args) {
	Employee e1=new Employee("Kiran",23,20000);
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
	
	ArrayList<Employee>Semplist=new ArrayList<>();
	
	for(Employee emp:emplist) {
	   if(emp.getName().startsWith("S")) {
		   Semplist.add(emp);
	   }
		
	}
	System.out.println("Employee names start with S using Without predicate ---->");
	for(Employee Semp:Semplist) {
		System.out.println(Semp.getName());
		
	}
	
	
//	Semplist.addAll(0,emplist);
//	System.out.println(Semplist);
	
	
	System.out.println();
	
	
	
	Predicate<Employee>ref=e->e.getName().startsWith("S");
	List<Employee> preList=new ArrayList<>();
	
	for(Employee PreEmp:emplist) {
		
		if(ref.test(PreEmp)) {
			preList.add(PreEmp);
		}
		
	}
	System.out.println("Employee names start with S using With using predicate ---->");
	for(Employee e:preList) {
		System.out.println(e.getName());
		
	}
	
	

	}

}
