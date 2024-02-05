package lambdaExpressions;

public class ReturnAreas extends PlotCost{

	public static void main(String[] args) {
		
		 ReturnTypeFunctional rectangle =(length,breadth)
				->{ return length*breadth;
			};
			
			
		 ReturnTypeFunctional triangle =(base,height)
					->{ return (base*height)/2;
				};
				
		 ReturnTypeFunctional pentagon =(s,a)
						->{ return Math.floor(5.0/2.0)*s*a;
					};
					
		 OneParameterFunctional hexagon = a
							->{ return (3*(1.732)*Math.pow(3,2)/2);
						};
					
			   ReturnAreas al = new ReturnAreas();
				
			double Rectangle=rectangle.area(10, 20);
			System.out.println("Area of Rectangle is = "+Rectangle);
			System.out.println("plotcost of Rectangle is = "+al.plotCost(Rectangle, 23.3));
			System.out.println();
			
			double Triangle=triangle.area(2, 3);
			System.out.println("Area of Triangle is = "+Triangle);
			System.out.println("plotcost of Triangle is = "+al.plotCost(Triangle, 12.3));
			System.out.println();
			
			double Pentagon=pentagon.area(23.1, 34.5);
			System.out.println("Area of Pentagon is = "+Pentagon);
			System.out.println("plotcost of Pentagon is = "+al.plotCost(Pentagon, 21.5));
			System.out.println();
			
			double Hexagon=hexagon.area(23.1);
			System.out.println("Area of Hexagon is = "+Hexagon);
			System.out.println("plotcost of Hexagon is = "+al.plotCost(Hexagon, 5.5));
			System.out.println();
			
			

	}

	@Override
	double plotCost(double area,double persqrd) {
		double plotcost=area*persqrd;
		return plotcost;
		
	}

}
