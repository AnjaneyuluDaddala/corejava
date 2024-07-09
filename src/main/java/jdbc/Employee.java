package jdbc;

public class Employee {
	
	public Employee(int eid, String ename, Double salary, String department) {
		
		Eid = eid;
		Ename = ename;
		Salary = salary;
		Department = department;
	}
	
	public Employee() {
		
	}
	private int Eid;
	private String Ename;
	private Double Salary;
	private String Department;
	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", Salary=" + Salary + ", Department=" + Department + "]";
	}

}
