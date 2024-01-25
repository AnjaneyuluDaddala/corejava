package oops_concepts;

abstract public class Start {
	double salary;
	double withdrawAmount;
	double balance;
	
	protected void place() {
		System.out.println("Abstract class is invoked--");
	}
	
  
    protected abstract void withdrawAmount(double withdrawAmount,double salary);
   
	double  balance() {
    	
    	this.withdrawAmount=1000;
    	this.salary=20000;
    	balance=salary-withdrawAmount;
    	return balance;
		
    }
	
	public static void run() {
		System.out.println("The static method is running in abstract class ---");
	}
	void display() {
		System.out.println("The salary of parent is = " +salary);
		System.out.println("The salary of parent is = " +withdrawAmount);
		System.out.println("The balance of parent class is = " +balance);
		run();
		
	}
	void show() {
		System.out.println("The method is in parent class invoked .....");
	}
	
	abstract void listen();

}
