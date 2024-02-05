package function;

import java.util.function.Function;

import predecate.Employee;

public class Practice1 {

	public static void main(String[] args) {
		
		Employee e9=new Employee("Siva",50,90000);
		
		Function<Employee,String> emp=a->"MR."+a.getName();
		System.out.println(emp.apply(e9));	

	}

	
}
