package practice;

public class MyParent {
	
	 private int dim1;
	 private int dim2;
	 
	 public MyParent() {
		 
	 }
	
	public MyParent(int dim1,int dim2) {
		this.dim1=dim1;
		this.dim2=dim2;
	}
	void area() {
	
		int area=this.dim1*this.dim2;
		System.out.println(area);
	}
	
	

}
