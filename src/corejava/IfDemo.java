package corejava;

public class IfDemo {

	  public static void main(String[] args) {
	    
	    int age=21;
	    int ageLimit=18;
	    boolean isBlind=true;
	    boolean isMale=false;
	    
	    if(age>=ageLimit) {
	      if(isMale) {
	        System.out.println("Please dont issue DL");
	      }else {
	        System.out.println("Please issue DL");
	      }
	    }else {
	      System.out.println("He is minor");
	    }
	    

	  }

	}