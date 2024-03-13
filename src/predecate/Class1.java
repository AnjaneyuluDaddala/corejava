package predecate;

import java.util.function.Predicate;

public class Class1 {
	
	static boolean m1(Employee x) {
		if(x.getAge()>18 && x.getName().startsWith("K")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee e1=new Employee("kiran",13,20000.0);
    
    Predicate<Employee> pre=(e)->e.getAge()>18;
    Predicate<Employee>pre1=e->e.getName().startsWith("K");
   /* 
    boolean major=pre.test(e1);
    //System.out.println( pre.test(e1));
    
    if(pre.test(e1)) {
    	System.out.println(e1.getName()+" is right for vote ");
    }else {
    	System.out.println(e1.getName()+" is not for vote ");
    }
    
    */
    
    Predicate<Employee>combined=pre.and(pre1);
    
    System.out.println(combined.test(e1));
    
    System.out.println(pre.and(pre1).test(e1));
    
    
    
    
    
    
	}

}
