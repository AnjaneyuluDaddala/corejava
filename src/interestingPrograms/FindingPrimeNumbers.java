package interestingPrograms;

import java.util.ArrayList;

public class FindingPrimeNumbers {
	
	public static ArrayList<Integer> findPrimes(int start,int end){
		
		ArrayList<Integer>primes=new ArrayList<Integer>();
		
		for(int n=start;n<end;n++) {
			boolean prime=true;
			int i=2;
			while(i<=n/2) {
				//System.out.println("Checking if "+i+" it is a multiple ");
				if(n%i==0) {
					//System.out.println("we found the multiple of "+i);
					prime=false;
					break;
				}
				i++;
			}
			if(prime) {
				primes.add(n);
			}
			
		}
		
	
		return primes;
		
	}

	public static void main(String[] args) {
		
		System.out.println(findPrimes(2, 100));
		
		

	}

}
