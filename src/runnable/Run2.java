package runnable;

public class Run2 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread=new Thread(new Run2());
	    thread.start();	
	    
	    
	    
	    Runnable runable=()->System.out.println("run method invoked through lambda expression..");
	    runable.run();

	
	
	 Runnable runable1=()->{
		 System.out.println("run method invoked through lambda expression..different way.");
	 };
	
	 Thread thread1=new Thread(runable1);
	 thread1.start();
	
	
	}
	@Override
	public void run() {
		System.out.println("run------>method is invoked");
		
	}

}
