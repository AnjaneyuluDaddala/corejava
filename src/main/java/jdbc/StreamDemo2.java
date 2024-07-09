package jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {

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
		
		System.out.println("Before not using stream---->"+emplist);
		Stream<Employee> streamList=emplist.stream().filter(a->a.getEname().startsWith("S"));
		//streamList.forEach(a->System.out.println(a));
		//emplist=streamList.collect(Collectors.toList());
		//System.out.println("Before not using stream---->"+emplist);
		
		List<Double>list=streamList.map(a->a.getSalary()*100).collect(Collectors.toList());
		System.out.println("Increment of their salary = "+list);
		
		

	}

}
