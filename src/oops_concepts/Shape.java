package oops_concepts;

public interface Shape {
	 static double plotCostperYard=100;
	
	abstract double  area(double side1,double side2);
	abstract double  area(double side1);
	abstract double plotcost(double area);
	
	static void son() {
		System.out.println("hello");
	}

}
