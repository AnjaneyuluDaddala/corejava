package runnable;

public class Run1 {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Runnable r = new Runnable(){
			
			@Override
			
			public void run() {
				System.out.println("My Runnable in normal method");
				
				
			}};
			r.run();
			
			r.wait(2000);
			

			
			Runnable r1 =()->{
				System.out.println("prints runnable in lamda expression");
			};
			r1.run();
			
	}

}
