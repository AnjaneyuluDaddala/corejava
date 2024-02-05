package predecate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicate11 {

	public static void main(String[] args) {
		Employee e1=new Employee("naresh",23,50000);
		Employee e2=new Employee("Suresh",93,90000);
        ArrayList<Employee> empList=new ArrayList<Employee>();
        empList.add(e1);
        empList.add(e2);
        
        Predicate<Employee> ref=emp->emp.getAge()<60;
        
        for(Employee employee:empList) {
        	System.out.println(ref.test(employee)==true?employee.getName()+" is elgible for health insurance":
        		employee.getName()+" is not elgible for health insurance");
        			
        }
	}

}
