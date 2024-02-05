package abstractClasses;

public class NormalClass extends A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new NormalClass().m2();

	}

	@Override
	void m1() {
		// TODO Auto-generated method stub
		
	}
	void m2() {
		super.m2();
		System.out.println("Normal class is invoked-->");
	}

	@Override
	public void m8() {
		// TODO Auto-generated method stub
		
	}

}
