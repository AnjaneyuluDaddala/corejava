package functionalInterface;

public class UsingClass {

	public static void main(String[] args) {
		InterfaceF1 inter= new Test();
		inter.Siva("Siva not using Lmbda Expression");
		
		//using lambda Expression.
		
		InterfaceF1 inter1=(name)->System.out.println("Method is invoked "+name);
		inter1.Siva("hello Sivaa");

	}

}
