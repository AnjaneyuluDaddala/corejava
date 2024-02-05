package defaultAndstatic;
@FunctionalInterface

public interface UsuageDefaultInterface {
	
		void method1(String str);
		
		default void m1(String str){
			System.out.println("default printing logging::"+str);
		}
		
		static void print(String str){
			System.out.println("static in iterface Printing "+str);
		}
		
		//trying to override Object method gives compile-time error as
		//"A default method cannot override a method from java.lang.Object"
		
//		default String toString(){
//			return "i1";
//		}
		
	}

