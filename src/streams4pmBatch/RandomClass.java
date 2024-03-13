package streams4pmBatch;

import java.util.Random;

public class RandomClass {
	
	public static void main(String[] args) {
		Random random=new Random();
		int d=random.nextInt();
	    System.out.println(Math.floor(d)*10);
	    
	    
	    
	    //String
	    
	    
	    String s="Anjan,Balu,Charan,Darling,Eliaz";
	    String[] split = s.split(",");
	    System.out.println(split[0]);
	    
	    	    for (String Alpabets : split) {
	    	    System.out.println(Alpabets);
	    	    }
		


}
}
