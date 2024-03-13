package predecate;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Class7thDate1 {

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
		
		
		
		Predicate<Employee>ref=e->e.getName().startsWith("S");
		ArrayList<Employee>Semplist=new ArrayList<>();
		for(Employee emp:emplist) {
			boolean Sename=ref.test(emp);
			if(Sename) {
				Semplist.add(emp);
				
			}
			
		}
		for(Employee emp:Semplist) {
			System.out.println("Employees start with R :-"+emp.getName());
		}
		
		System.out.println();
		
		
		Predicate<Employee>ref1=e->e.getName().startsWith("P");
		ArrayList<Employee>Remplist=new ArrayList<>();
		
		for(Employee emp1:emplist) {
			boolean Rename=ref1.test(emp1);
			if(Rename) {
				Remplist.add(emp1);
				
			}
			
		}
		for(Employee emp1:Remplist) {
			System.out.println("Employees start with P :-"+emp1.getName());
		}
		
		
		
		//Using Consumer
		Consumer<ArrayList<Employee>>consumer=list->{
			list.addAll(1,Remplist);
			System.out.println("Final list of SempList-->"+Semplist);
			
			Semplist.forEach(t ->System.out.println(t));
			
		};
		consumer.accept(Semplist);
		
	}

}
