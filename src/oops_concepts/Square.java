package oops_concepts;

public class Square extends Rectangle implements Shape{
	
	
	double area;
	
	
	void m1() {
		
		double plotcost=super.plotcost(area);
		System.out.println("The plot cost of square =" +plotcost);
		
	}
	void m2() {
		double area1=super.area(21,12);
        double plotcost=super.plotcost(area1);
		System.out.println("The plot cost of rectangle =" +plotcost);
		
		
	}


	public static void main(String[] args) {
		Square sc=new Square();
		sc.area(12);
		sc.m1();
		sc.m2();
		
		//double plotcost=plotcost;
		
				
	}

	@Override
	public double area(double dim1, double dim2) {
		
		return 0;
			
	}

	@Override
	public double area(double dim1) {
		// TODO Auto-generated method stub
		
		area=dim1*dim1;
		System.out.println("Area of square is "+area);
		return area;
	}
	
	

}
