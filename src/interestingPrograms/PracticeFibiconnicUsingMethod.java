package interestingPrograms;

public class PracticeFibiconnicUsingMethod {
	
	static void m1(int n) {
		
		int firstTerm=0;
		int secondTerm=1;
		
		System.out.println("Fibconicc series:");
		System.out.print(firstTerm+" "+secondTerm);
		
		for(int i=3;i<=n;i++) {
			int nextTerm=firstTerm+secondTerm;
			System.out.print(" "+nextTerm+" ");
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
	}

	public static void main(String[] args) {
		m1(7);

	}

}
