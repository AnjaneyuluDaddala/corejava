package stringsInjava;

public class StringbufferClass {
	
	public static void main(String[] args) {
		
		StringBuffer sbf=new StringBuffer();
		
		System.out.println(sbf.capacity());
		
		sbf.append("helloworld");
		
		System.out.println(sbf);
		
		sbf.reverse();
		
		System.out.println(sbf);
		
		sbf.insert(5, " ");
		
		System.out.println(sbf);
		
		
		/* string buffer and string builder is mutable ,they can be changed after they are created. 
		 * Both is thread safe and used safely in multi-thread applications
		 * Both used to manipulate strings same methods ,such as append(),insert() and delete().
		 * Both are more efficient than the string class for manipulating strings.they do not create a new object every time a string is modified.
		 *  
		 */
		System.out.println();
    StringBuilder sbf1=new StringBuilder();
		
		System.out.println(sbf1.capacity());
		
		sbf1.append("dlrowolleh");
		
		System.out.println(sbf1);
		
		sbf1.reverse();
		
		System.out.println(sbf1);
		
		sbf1.insert(5, " ");
		
		System.out.println(sbf1);
		
		
		
	}

}
