package oops_concepts;

public class B extends A{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		B b=new B();
		b.chane3(12);
		b.chane3(21.0);
		

	}

	@Override
	void chane3(double dim1) {
		 System.out.println("Chaneel 3 is displayed");
	}
	void chane3(float dim1) {
		 System.out.println("Chaneel 3 is displayed");
	}
	void chane3(double dim1,double dim2) {
		 System.out.println("Chaneel 3 is displayed");
	}
	
	void chane3(int dim1) {
		 System.out.println("Chaneel  is displayed");
	}
	
	

	@Override
	void chane4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void chane5() {
		// TODO Auto-generated method stub
		
	}
	 void chanel() {
		 System.out.println("Chaneel 1 is displayed");
	 }
	

}
