package multiThreading;

public class Tent extends Thread{
	@Override
	public void run() {
		System.out.println("Thread 2 is initated------->");
		
		
		try {
			Thread.sleep(2000);
			
		}catch(Exception e) {
			System.out.println("erreor");
			
		}
		System.out.println("Tent materials are taken---->");
	}

}
