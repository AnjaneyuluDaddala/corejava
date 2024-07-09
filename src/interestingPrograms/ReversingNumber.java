package interestingPrograms;

public class ReversingNumber {
	
	public int reverse(int num) {
		
		int reverseN=0,r;
		while(num>0) {
			r=num%10;
			reverseN=reverseN*10+r;
			num=num/10;
		}
		return reverseN;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int number=new ReversingNumber().reverse(123445);
    System.out.println("The reversing number is "+number);
		
	}

}
