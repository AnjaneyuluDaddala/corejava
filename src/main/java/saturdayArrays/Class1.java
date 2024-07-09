package saturdayArrays;

public class Class1 {

	public static void main(String[] args) {
		int[] numbers=new int[10];
		
		int val=10;
		for(int i=1;i<=numbers.length-1;i++) {
			numbers[i]=val*5;
			val++;
			
		}
		for(int i=1;i<=numbers.length-1;i++) {
			
			System.out.println("numbers["+i+"]= "+numbers[i]);
			
			
		}
				
		

	}

}
