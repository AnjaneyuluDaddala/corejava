package assingnments;

public class Raj  implements employee{
	
	
	
	public static void main(String[] args) {
		Raj R =new Raj();
	
		R.personDetails("Raj", 22, "hyderabad");
		R.salary(50000, 1000, 50, 10000);
		

	}

	@Override
	public double salary(double hra, double basic, double ta, double deductions) {
		
		 double totalSalary=hra+basic+ta-deductions;
		 System.out.println("The total salary of Raj =" +totalSalary);
		
		return totalSalary;
	}

	@Override
	public void personDetails(String name, int age, String address) {
		System.out.println("The Person Details");
		System.out.println("Name of person =" +name);
		System.out.println("Age of person =" +age);
		System.out.println("address of person =" +address);
	
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	

}
