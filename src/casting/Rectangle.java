package casting;

public class Rectangle extends Shape {
	
	void plotCost(float area,float perYard) {
		double Plotcost=area*perYard;
		System.out.println("The cost of plot area is = "+Plotcost);
	}
	
	public static void main(String[] args) {
		//Shape s=new Rectangle();
		
		
		//DownCasting (parent obj referrnce change to child obj reference)
		//we get all services of parent and child class.
		
		
//		Shape s2=new Shape();----we cannot create obj of abstract class.
		Shape s1=new Rectangle();
		
		((Rectangle)s1).plotCost(23, 12);
	
		
		/*
		 * it is only possible in parent is not abstract class and parent extends child
		 Shape s2=new Shape();
		((Rectangle)s2).plotCost(12, 90);
		
		*/
		
		//Upcasting
		// child class reference ,I want only parent services and not invoke the child class services ...yes it is possible
		 Rectangle rf=new Rectangle();
		((Shape)rf).area(21);
		// ((Shape)rf).Plotcost(12,34);----see error is coming.
		
		
		//below through this we can get all services of parent and child classes.
		((Rectangle)((Shape)rf)).plotCost(23,12);
	}

}


