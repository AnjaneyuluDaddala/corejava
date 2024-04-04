package streams4pmBatch;

import java.util.*;
import java.util.stream.Stream;

import predecate.Employee;

public class UsnngMapFilter {

	public static void main(String[] args) {
		Employee emp1 =new Employee("Prasanna",21,290000);
		Employee emp2 =new Employee("Sowmaya",22,200000);
		Employee emp3 =new Employee("Sunil",23,300000);
		Employee emp4 =new Employee("Sampath",24,600000);
		Employee emp5 =new Employee("Anjan",21,900000);
		Employee emp6 =new Employee("Prakash",20,600000);
		
		List<Employee> list= new ArrayList<> ();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		
		list.stream().map(a->a.getName().toUpperCase()).forEach(System.out::println);
		
		System.out.println();
		
		list.stream().filter(e->e.getName().startsWith("S")).map(Employee::getSalary).forEach(System.out::println);
		
//		.forEach(System.out::println);
		
		
		

		System.out.println();
		
		
		List<String> Stringlist= new ArrayList<> ();
		Stringlist.add("Sunil");
		Stringlist.add("Sowmya");
		Stringlist.add("Sampath");
		Stringlist.add("Anil");
		Stringlist.add("Prakash");
		
		System.out.println();
		Stringlist.stream().map(String::toUpperCase).forEach(System.out::println);
		

	}

}
