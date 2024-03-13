package function;

import java.util.ArrayList;
import java.util.function.Function;

public class SixthMarch {

	public static void main(String[] args) {
		
		ArrayList<Integer>arrlist=new ArrayList<>();
		arrlist.add(12);
		arrlist.add(23);
		Function<ArrayList<Integer>,Integer>ref1=a->a.get(0)*a.get(1);
		
		int area1=ref1.apply(arrlist);
		System.out.println("Area of Rectangle = "+area1);
		
		System.out.println();
		
		Function<Integer,Integer>ref=dim1->dim1*dim1;
		int area=ref.apply(23);
		System.out.println("Area of square = "+area);

	}

}
