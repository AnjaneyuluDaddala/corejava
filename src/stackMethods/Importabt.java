package stackMethods;

public class Importabt {
	
	void m1() {
		m2();
	}
	void m2() {
		m3();
	}
	void m3() {
		System.out.println("m3===============> is invoked...");
		
	}

	public static void main(String[] args) {
		new Importabt().m1();
		

	}

}


