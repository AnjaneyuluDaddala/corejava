package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;


public class ConsumeImpl {
	
	public static void main(String[] args) {
		Employee emp1=new Employee("prakash",21,2000.0);
		Employee emp2=new Employee("mukesh",21,2000.0);
		Employee emp3=new Employee("jaikrishna",21,2000.0);
		Employee emp4=new Employee("prabuu",21,2000.0);
		
		List<Employee> list =new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		Iterator<Employee> itr = list.iterator();
		
		Consumer<Employee>cons=x->{
			String name=x.getEmpName().concat("Mr.");
     		System.out.println(name);
		};
		itr.forEachRemaining(cons);
		
		}
		
		
	
	}


