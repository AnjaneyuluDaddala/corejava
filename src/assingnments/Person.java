package assingnments;

public class Person {
	
	String name;
	int age;
	char gender;
	
	void display() {

		System.out.println("The details of person is:");
		System.out.println( "welcome to this java world "+name);
		System.out.println(age);
		System.out.println(gender);
		
	}

	public static void main(String[] args) {
		Person p=new Person();
		p.name="Anjaneyulu";
		p.age=21;
		p.gender='M';
		p.display();
		

	}

}
