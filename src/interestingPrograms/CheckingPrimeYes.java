package interestingPrograms;
public class CheckingPrimeYes {
	
	static boolean checkingPrime(int n){
		
		boolean prime=true;
	    int i=2;
	    
		while(i<=n/2) {
			if(n%i==0) {
				prime=false;
				break;
			}
			i++;
			
			
		}
		
		//System.out.println("if is prime print true (or) print  false: " + prime);
		return prime;
		
	}

	public static void main(String[] args) {
		
	  boolean prime=checkingPrime(1);
	  
	  System.out.println("if it is prime print true (or) print  false: " + prime);
	  
		

	}

}
