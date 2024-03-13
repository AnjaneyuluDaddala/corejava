package supplier;

import java.util.function.Supplier;

public class Newfile {

	public static void main(String[] args) {
		Supplier<Double> rf=()->{
			return Math.floor(1+Math.random()*9);
		};
		System.out.println(rf.get());
		
		
		Supplier<Double>rff=()-> Math.floor(Math.random()*20);
		System.out.println(rff.get());
		
		

	}

}
