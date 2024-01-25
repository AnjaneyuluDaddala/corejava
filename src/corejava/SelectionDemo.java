package corejava;

public class SelectionDemo {
	  
	  void ifElseDemo() {
	    
	    int childAge=6;
	    
	    if(childAge==5) {
	      System.out.println("Class 1  ");
	    }else if(childAge==6) {
	      System.out.println("Class 2  ");
	    }else if(childAge==6) {
	      System.out.println("Class 3   ");
	    }else {
	      
	    }
	     
	    
	  }

	  void switchCaseDemo() {
	    
	    int childAge=115;
	    
	    switch(childAge) {
	    
	      default:
	           System.out.println("Please provide valid case number");
	           break;
	      
	    case 5:
	      System.out.println("Class 1");
	      System.out.println("Class Teacher  is Ram");
	      System.out.println("Class Strength 50 ");
	      
	    case 6:
	      System.out.println("Class 3");
	      break;
	      
	    case 8:
	      System.out.println("Class 4");
	      break;
	          
	    case 14:
	      System.out.println("Class 10");
	      break;
	      
	     
	    
	    }
	    
	    
	    
	    
	  }
	  
	  
	  public static void main(String[] args) {
	    
	    SelectionDemo selDemo = new SelectionDemo();
	    selDemo.switchCaseDemo();
	    

	  }

	}
