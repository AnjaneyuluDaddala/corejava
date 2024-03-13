package function;

import java.util.function.Function;

public class Newfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer,String>ref=t->t*10+" multiplying to the 10";
		System.out.println(ref.apply(10));

	}

}
