package consumer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import predecate.Employee;
public class Consumer11 {

	public static void main(String[] args) {
		List<String>al=new ArrayList<>();
		al.add("Buchibabu");
		al.add("krishna");
		al.add("prasanna");
		
	
		al.add("suresh");
		
		Iterator<String> it=al.iterator();
		
		Consumer<String> consume=a->{
			String name=a.concat("  Mr.");
			
			System.out.println( name);
		};
				
		it.forEachRemaining(consume);
		
		
		
		
		
		Employee emp=new Employee("rani",22,50000);
		Employee emp1=new Employee("sourya",24,40000);
		Employee emp2=new Employee("raju",28,90000);
		
		
		ArrayList<Employee>array=new ArrayList<Employee>();
		array.add(emp);
		array.add(emp1);
		array.add(emp2);
		
		
		Iterator<Employee> itr=array.iterator();
		Consumer< Employee> cons=a->System.out.println(a);
		itr.forEachRemaining(cons);

	}

}
