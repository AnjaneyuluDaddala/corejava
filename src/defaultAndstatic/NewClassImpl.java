package defaultAndstatic;

public class NewClassImpl implements UsuageDefaultInterface{
	
	
	public void m2(String str) {
		System.out.println("default of child --------->"+str);
	}
	
	//@Override
	static void print(String str) {
		System.out.println("Child class ------> invoked "+str);
	}

	public static void main(String[] args) {
	
		print("suresh");
		//super.print("ramu");  here we canoot override the static methods and we canoot invoke the static method with super in interface..
		
		
		//m2("mamabro");

	}

	@Override
	public void method1(String str) {
		// TODO Auto-generated method stub
		
	}

	
}
