package batch6Pm;

public class Student {
	public Student(int id, String name, String schoolName, double marks, String course) {
	
		this.id = id;
		this.name = name;
		this.schoolName = schoolName;
		this.marks = marks;
		this.course = course;
	}
	
	public Student() {
		
	}
	private int id;
	private String name;
	private String schoolName;
	private double marks;
	private String course;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", schoolName=" + schoolName + ", marks=" + marks + ", course="
				+ course + "]";
	}
	
	
	
	
	
	

}
