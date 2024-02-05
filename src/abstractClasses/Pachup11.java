package abstractClasses;

public class Pachup11 {
	
	String Firstname;
	String Lastname;
	int age;
	double markspercent;
	
	Pachup11(String first,String last,int age,double marks){
		this.Firstname=first;
		this.Lastname=last;
		this.age=age;
		this.markspercent=marks;
	}
	public void setFirstname(String first) {
		this.Firstname=first;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setLastname(String Last) {
		this.Lastname=Last;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public double getMarkspercent() {
		return markspercent;
	}
	public void setMarkspercent(double markspercent) {
		this.markspercent = markspercent;
	}

}
