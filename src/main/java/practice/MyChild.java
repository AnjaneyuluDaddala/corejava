package practice;

public class MyChild extends MyParent{
	 
	MyChild(){
		super(12,13);
	}

	

	public static void main(String[] args) {
		MyParent mp=new MyChild();
		mp.area();
		

	}

	

}
