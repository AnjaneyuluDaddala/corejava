package assingnments;

public class Kiran implements employee{

	public static void main(String[] args) {
		Kiran K=new Kiran();
		K.personDetails("Kiran", 23, "pune");
		K.salary(6000, 10000, 1000, 5000);
	

	}

	@Override
	public double salary(double hra, double basic, double ta, double deductions) {
		// TODO Auto-generated method stub
		 double totalSalary=hra+basic+ta-deductions;
		 System.out.println("The total salary of Raj =" +totalSalary);
		return totalSalary;
	}

	@Override
	public void personDetails(String name, int age, String address) {
		// TODO Auto-generated method stub
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
