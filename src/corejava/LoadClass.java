package corejava;

public class LoadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c=LoadClass.class;
		
		 // Let's print the classloader name of current class.   
        //Application/System classloader will load this class
		
		System.out.println("The loader of the class = "+c.getClassLoader());
		
		 //If we print the classloader name of String, it will print null because it is an  
        //in-built class which is found in rt.jar, so it is loaded by Bootstrap classloader
		System.out.println("string class loader= "+String.class.getClassLoader());
		
		//These are the internal classloaders provided by Java.
		//If you want to create your own classloader, you need to extend the ClassLoader class.

	}

}
