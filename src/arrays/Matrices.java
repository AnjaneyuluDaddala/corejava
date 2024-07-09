package arrays;

public class Matrices {
	public static void main(String[] args) {
		int arr[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int arr1[][]={{1,1,1},{2,2,2},{3,3,3}};
		
		int c[][]=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				c[i][j]=0;
				
				for(int k=0;k<3;k++) {
					c[i][j]+=arr[i][j]*arr1[i][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
