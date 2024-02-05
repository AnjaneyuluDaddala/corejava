package multiThreading;

public class Ingredients extends Thread {
	@Override
	public void run(){
		System.out.println("Thread 1 is intiateed ---------->");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Vegetables are taken from market------->");
	}

}
