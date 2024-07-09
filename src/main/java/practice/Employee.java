package practice;

public class Employee {
	
	private String empName;
	private int empAge;
	private double salary;
	
	
	public Employee() {
		
	}
	
	
	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpAge() {
		return empAge;
	}


	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public Employee(String empName, int empAge, double salary) {
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.salary = salary;
	}
	
	

}
