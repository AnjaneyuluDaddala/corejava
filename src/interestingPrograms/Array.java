package interestingPrograms;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[5];
		
		int b[]= {1,3,4,5,6};
		
		int crr[];
		
		a[0]=1;
		a[1]=2;
		a[2]=2;
		a[3]=2;
		a[4]=2;
		
		
		/*
		 * foreach loop
		 * 
		 * for(int i:a){
		 * System.out.println(i);
		 */
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
