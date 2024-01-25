package oops_concepts;

public class Rectangle implements Shape {
	 double area;
	
	public double area(double dim1,double dim2) {
		
		area=dim1*dim2;
		System.out.println("Area of Rectangle is = " +area );
		
		return area;
	}
	
   public double area(double dim1) {
	   
	   return 0;
		
	}
	
	

	public static void main(String[] args) {
		Rectangle Rc=new Rectangle();
		Rc.area(21, 12);
		double plotcost=Rc.plotcost(Rc.area(21, 12));
		
		System.out.println("The plot cost of Rectangle is = "+plotcost);
		

	}
	@Override
	public double plotcost(double area) {
		double plotcost =area*plotCostperYard;
		return plotcost;
	}

}
