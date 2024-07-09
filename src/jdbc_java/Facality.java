package jdbc_java;

public class Facality {
	
	public Facality(int personId, String lastName, String firstName, String city, String address) {
		this.PersonId = personId;
		this.LastName = lastName;
		this.FirstName = firstName;
		this.City = city;
		this.Address = address;
	}
	private int PersonId;
	private String LastName;
	private String FirstName;
	private String City;
	private String Address;
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
	@Override
	public String toString() {
		return "Facality [PersonId=" + PersonId + ", LastName=" + LastName + ", FirstName=" + FirstName + ", City="
				+ City + ", Address=" + Address + "]";
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
}
