package practice;

public class FactionalImpl {

	public static void main(String[] args) {
		
		Factionalinter ref=(dim1,dim2)->{
			double area=dim1*dim2;
			System.out.println(area);
		};
		
		
		ref.area(12, 34);
		

	}

}
