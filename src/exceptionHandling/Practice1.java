package exceptionHandling;

public class Practice1 {
	
	int a=5/0;
	/*
	try {
		int a=1/0;	
	}catch(Exception e){
		System.out.println("error variable");
	}
	
*/
	public static void main(String[] args) {
		try {
			int data=100/0;
			
		}catch(ArithmeticException e) {
			System.out.println(e.getStackTrace());
			System.out.println(e);
			System.out.println(e.getMessage());
			
		}
		System.out.println("level 1---------------->initaited...");

		try {
			System.out.print(new Practice1().a);
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("c-------------> is invoked");
		
		
		String s1="abc";  
		int i=Integer.parseInt(s1);//NumberFormatException  
		
		String s=null;
		System.out.println(s.length()); // null pointException..
		
		
	}
	

}

