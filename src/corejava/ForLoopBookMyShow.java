package corejava;
public class ForLoopBookMyShow {

	  public static void main(String[] args) {
	  
	    char seatNo=65;
	    
	    for(int row=1;row<=6;row++) {
	      System.out.print(seatNo+"  ");
	      seatNo++;
	      for(int seat=1;seat <=10; seat++) {
	        
	        System.out.print("["+seat+"]");
	      }
	      
	      System.out.println();
	      
	    }
	    
	    

	  }

	}
