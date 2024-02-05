package jdbcToJdk8;



public class Student {
	public Student() {
		
	}
	
	public Student(int id,String studentName,int studentMarks, String schoolName,int rank) {
		super();
		this.studentName = studentName;	
		this.studentMarks = studentMarks;
		this.schoolName = schoolName;
		this.id=id;
	}
	private String studentName;
	private int studentMarks;
	private String schoolName;
	private int id;
	private int rank;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public int getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentMarks=" + studentMarks + ", schoolName=" + schoolName
				+ ", id=" + id + ", rank=" + rank + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

}
