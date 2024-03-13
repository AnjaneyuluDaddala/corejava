package function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Fif5thMarch {

	public static void main(String[] args) {
		Employee1 e1=new Employee1("Siva",22,200000);
		Employee1 e2=new Employee1("Suresh",23,200000);
		Employee1 e3=new Employee1("Naresh",26,200000);
		Employee1 e4=new Employee1("Haresh",28,200000);
		
		ArrayList<Employee1> emplist=new ArrayList<>();
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		
		//Using Stream 
		
		
		Stream<Employee1>streamList=emplist.stream().filter(a->a.getName().startsWith("S"));
		List<Employee1> llist1=streamList.collect(Collectors.toList());
		System.out.println(llist1);
		
		
		System.out.println();
		
	   //Using Function interface
		List<String>list1=new ArrayList<>();
		
		Function<Employee1,Boolean>ref=e->{
			return e.getName().startsWith("S");
			
		};
		
		for(Employee1 emp1:emplist) {
			
			boolean name=ref.apply(emp1);
			if(name) {
				list1.add(emp1.getName());
						
			}
			
		}
		System.out.println(list1);
		
			
		System.out.println();
		
		
		
		
		 //Simple Way
		List<String>list=new ArrayList<>();
		for(Employee1 emp:emplist) {		
			if(emp.getName().startsWith("S")) {
				list.add(emp.getName());		
			}	
		}
		System.out.println("List of Employees Stratwith 'S'= "+list);
		
		
		
	}

}
