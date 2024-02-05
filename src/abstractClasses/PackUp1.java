package abstractClasses;

public class PackUp1 {
	
	
	void m1(Packup Set ) {
		
		Set.setName("nana");
		Set.setAge(61);
		
		
		
		System.out.println("The name of customer Father= "+Set.getName());
		System.out.println("The age of customer Father= "+Set.getAge());
		
	}

	public static void main(String[] args) {
		
		Packup p1=new Packup();
		//PackUp1 p1=new PackUp1();
		

		
		p1.setName("anjan");
		p1.setAge(21);
		
		
		
		
		
		int age=p1.getAge();
		String name=p1.getName();
		
		System.out.println("The name of customer = "+name);
		System.out.println("The age of customer =  "+age);
		System.out.println();
		
		new PackUp1().m1(p1);
		
		
	
		

	}

}
