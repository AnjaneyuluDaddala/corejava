package predecate;

import java.util.function.Predicate;

public class Class2 {

	public static void main(String[] args) {
	
	Employee e1=new Employee("Suresh",38,70000);
	Employee e3=new Employee("Sai",58,10000);	
	
	Predicate<Employee> ag1=x->x.getAge()<60;
	Predicate<Employee> sal=x->x.getSalary()>30000;
	
	
	
	//and operator
	Predicate<Employee>condition=ag1.and(sal);
	boolean test=condition.test(e3);
	//or operator
	Predicate<Employee>condition1=ag1.or(sal);
	
	boolean test1=condition1.test(e3);

	if(test) {
		System.out.println(e3.getName()+" is elgible for health insurance ----->");
		
	}
	else {
		System.out.println(e3.getName()+" is not elgible for health insurance ===========>");
	}
	
	
	
	
	
	
	if(ag1.and(sal).test(e1)) {
		System.out.println(e1.getName()+" is elgible for health insurance ----->");
		
	}
	else {
		System.out.println(e1.getName()+" is not elgible for health insurance ===========>");
	}
	
	Employee e2=new Employee("naresh",70,80000);
	if(ag1.and(sal).test(e2)) {
		System.out.println(e2.getName()+" is elgible for health insurance ----->");
	}
	else {
		System.out.println(e2.getName()+" is not elgible for health insurance ===========>");
	}
	}

}
