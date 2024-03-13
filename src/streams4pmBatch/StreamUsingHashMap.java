package streams4pmBatch;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.stream.Stream;

import predecate.Employee;

public class StreamUsingHashMap {

	public static void main(String[] args) {
		
		Employee emp1=new Employee("Rani",21,20000);
		Employee emp2=new Employee("Krishna",22,70000);
		Employee emp3=new Employee("Sampath",19,59000);
		Employee emp4=new Employee("Shylu",27,49000);
		Employee emp5=new Employee("Shiva",24,39000);
		Employee emp6=new Employee("Ajay",11,68000);
		
		HashMap<Integer, Employee> map=new HashMap<>();
		map.put(1, emp1);
		map.put(2, emp2);
		map.put(3, emp3);
		map.put(4, emp4);
		map.put(5, emp5);
		map.put(6, emp6);
		
		
		
		//Enteryset collection of key and value.
		Stream<Entry<Integer, Employee>> stream = map.entrySet().stream();
		stream.forEach(System.out::println);
		
		System.out.println();
		//Only we want key 
		
		 Stream<Integer> keySet = map.keySet().stream();
		 keySet.forEach(System.out::println);
		
		System.out.println();
			//Only we want  values
		 Stream<Employee> ValueSet = map.values().stream();
		 
		 ValueSet.filter(e->e.getAge()>21).forEach(System.out::println);
		 
		 
		
		
		

	}

}
