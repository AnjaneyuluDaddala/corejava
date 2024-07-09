package nestedInterface;

public class Java1Impl implements Java1.Java2{

	public static void main(String[] args) {
		Java1.Java2 j1=new Java1Impl();
		j1.show();

	}

	@Override
	public void show() {
		System.out.println("java2 nested inteface invoked----->");
		
	}

}
