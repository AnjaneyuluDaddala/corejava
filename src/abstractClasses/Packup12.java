package abstractClasses;

public class Packup12 {
	
	static void m8(Pachup11 x) {
		System.out.print(x.getFirstname());
		System.out.println(" "+x.getLastname());
		System.out.println(x.getAge());
		System.out.println(x.markspercent);
		
		
	}

	public static void main(String[] args) {
		Pachup11 ps=new Pachup11("Anjaneyulu","Daddala",21,79.0);
		Pachup11 ps1=new Pachup11("Ajay","Daddala",19,90.2);
		m8(ps1);
		System.out.println();
		System.out.print(ps.getFirstname());
		System.out.println(" "+ps.getLastname());
		System.out.println(ps.getAge());
		System.out.println(ps.getMarkspercent());
		
		
		
	    

	}

}
