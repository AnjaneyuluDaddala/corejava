package oops_concepts;

public class End extends Start{
	

	public End(double salary,double withdrawAmount){
		
			this.salary=salary;
			this.withdrawAmount=withdrawAmount;
			

	}
	
	
	
	void listen() {
		
	}
	 protected void withdrawAmount(double withdrawAmount,double salary) {
		 
	 }
	 
	 void child() {
		 
	 }
	 
	 // override
	 void show() {
		
	      super.show();
		 System.out.println("The child class is invoked here .....");
		 
	 }
	 void check() {
		double balance=salary-withdrawAmount+super.balance;
		System.out.println("The child balance = " +balance);
		System.out.println("The parent balance = " +super.balance);
		
		 
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		End e=new End(10000,1000);
		e.balance();
		e.show();
		e.check();
	

	}

}
