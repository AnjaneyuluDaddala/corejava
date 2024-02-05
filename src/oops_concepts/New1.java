package oops_concepts;

import lambdaExpressions.Shape1;

public class New1 {

	public static void main(String[] args) {
		Shape1 rectangle=(double dim1,double dim2)->System.out.println("area of rectangle= "+dim1*dim2);
		
		  rectangle.area(23, 21);
			
       Shape1 triangle=(double dim1,double dim2)->System.out.println("area of rectangle= "+ 1/2*dim1*dim2);
		   	
		  triangle.area(4, 9);

	}

}
