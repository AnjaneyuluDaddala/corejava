package sowmya;

public class Prasanna {
	
	public static boolean sum(int n) {
		
		int sum=0;
		int temp;
		temp=n;
		while(n>0) {
		int	r=n%10;
			sum=(sum*10)+r;
		
			n=n/10;
			
		}
		if(temp==sum) {
			return true;
			
		}else {
			return false; 
		}
		
	}

	public static void main(String[] args) {
		System.out.println("this is palindrom the number is = "+sum(123));
		

	}

}
