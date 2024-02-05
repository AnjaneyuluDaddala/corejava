package function;

import java.util.function.Function;

import predecate.Employee;

public class Practice2Salary {

	public static void main(String[] args) {
		
		Employee e1=new Employee("Madhan",56,50000);
		Employee e2=new Employee("venu",67,40000);
		Function<Employee,Double> ref=a->{
				
				double increaseFactor = 1 + (20 / 100);
		        double newSalary = a.getSalary() * increaseFactor;
		        newSalary = Math.round(newSalary * 100.0) / 100.0;
		        return a.getSalary()+newSalary;
		};
		
		System.out.println(e1.getName()+" is increased from "+e1.getSalary()+" to "+ref.apply(e1));
		System.out.println(e2.getName()+" is increased from "+e2.getSalary()+" to "+ref.apply(e2));
		
	}

}
