package streams;

public class Student {
	
	private int registrationN0;
	private String name;
	private String Batch;
	private String course;
	private String CollegeName;
	
	
	public Student() {
		
	}
	
	public Student(int registrationN0, String name, String batch, String course, String collegeName) {
		this.registrationN0 = registrationN0;
		this.name = name;
		Batch = batch;
		this.course = course;
		CollegeName = collegeName;
	}

	
	
	
	public int getRegistrationN0() {
		return registrationN0;
	}
	public void setRegistrationN0(int registrationN0) {
		this.registrationN0 = registrationN0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBatch() {
		return Batch;
	}
	public void setBatch(String batch) {
		Batch = batch;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [registrationN0=" + registrationN0 + ", name=" + name + ", Batch=" + Batch + ", course="
				+ course + ", CollegeName=" + CollegeName + "]";
	}

}
