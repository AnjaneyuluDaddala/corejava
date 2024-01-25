package corejava;

public class IteratorDemo {
	  
    void sayGoodEvening() {
      System.out.println("Good afternoon / evening");
    }
    
    void sayGoodMoring() {
      System.out.println("Good Morning");
    }
  
  void forLoopDemo() {
    
    for(int time=5; time<23;time++ ) {
    
      if(time>4 && time <12) {
         sayGoodMoring() ;
      }else {
        sayGoodEvening();
      }
      
    }
  }
  
  public static void main(String[] args) {
    IteratorDemo id = new IteratorDemo();
    id.forLoopDemo();
  }

}
