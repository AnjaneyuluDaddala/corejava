package saturdayArrays;


import java.util.Random;

public class RandomArray {

	public static void main(String[] args) {
		Random ran=new Random();
		
		int[] array1= new int [35];
		
		for(int i=1;i<array1.length;i++) {
			array1[i]=ran.nextInt(100);
		}
		
		for(int i=1;i<array1.length;i++) {
			System.out.println("array1["+i+"]= "+array1[i]);
		
		}
		
		

	}

}
