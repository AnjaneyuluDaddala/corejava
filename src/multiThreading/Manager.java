package multiThreading;

public class Manager {

	public static void main(String[] args) {
		Ingredients id=new Ingredients();
		Tent t=new Tent();
		
		
	
		
		t.setPriority(1);
		id.setPriority(10);
		
		
		id.getPriority();
		t.getPriority();
		
		id.start();
		t.start();
		

	}

}
