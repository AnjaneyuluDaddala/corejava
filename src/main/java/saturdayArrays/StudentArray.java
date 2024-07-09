package saturdayArrays;

import batch6Pm.Student;

public class StudentArray {

	public static void main(String[] args) {
		Student s1=new Student(12,"samuel","Vedait",87,"java");
		Student s2=new Student(11,"sowmaya","Vedait",97,"java");
		Student s3=new Student(10,"kajal","jntu",77,"java");
		Student s4=new Student(2,"samantha","lpu",97,"java");
		Student s5=new Student(9,"anuradha","jntu",57,"java");
		
		
		Student[] students=new Student[10];
		students[1]=s1;
		students[0]=s2;
		students[3]=s4;
		students[2]=s3;
		students[7]=s5;
		
		
//		Time Complexity: O(n)
//		Auxiliary Space : O(1)
		
		for(Student array:students) {
			System.out.println(array);
		}
		

	}

}
