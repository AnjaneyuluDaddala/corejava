package batch6Pm;

public class FacalityNew {
	
	
	public FacalityNew(int personId, String lastName, String firstName, String city, String address, double salary,
			double rating) {
		
		PersonId = personId;
		LastName = lastName;
		FirstName = firstName;
		City = city;
		Address = address;
		this.salary = salary;
		Rating = rating;
	}
	public FacalityNew() {
		
	}
	
	private int PersonId;
	private String LastName;
	private String FirstName;
	private String City;
	private String Address;
	private double salary;
	private double Rating;
	public int getPersonId() {
		return PersonId;
	}
	public void setPersonId(int personId) {
		PersonId = personId;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getRating() {
		return Rating;
	}
	public void setRating(double rating) {
		Rating = rating;
	}
	@Override
	public String toString() {
		return "FacalityNew [PersonId=" + PersonId + ", LastName=" + LastName + ", FirstName=" + FirstName + ", City="
				+ City + ", Address=" + Address + ", salary=" + salary + ", Rating=" + Rating + "]";
	}

}
