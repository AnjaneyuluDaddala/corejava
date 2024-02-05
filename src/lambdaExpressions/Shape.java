package lambdaExpressions;

public class Shape {

	public static void main(String[] args) {	
		ShapeName rectangle=()-> System.out.println("invoke the area of rectangle");
		rectangle.area();
	}
}
