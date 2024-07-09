
package stack;

import java.util.Stack;
import java.util.Vector;



public class Practice1 {

	public static void main(String[] args) {
		Vector<String> st=new Stack<>();
		
		((Stack<String>) st).push("WhiteBook");
		((Stack<String>) st).push("BlackBook");
		((Stack<String>) st).push("RedBook");
		
		Stack<Integer> st1=new Stack<Integer>();
		
		st1.push(10);
		st1.push(30);
		st1.push(60);
		st1.add(40);
		st1.add(10);
		st1.push(10);
		st1.push(null);
		
		st1.add(0,100);
		st1.set(0, 1000);
		
		System.out.println(st1.get(0));
		
		
		// Above we already seen n vector ...and special methods of stack.
		
		// Now,we are seeing the Stack main methods are--pop,push,peek,search.
		
		
		Stack<String> stack =new Stack<>();
		stack.push("Whiteball");
		stack.push("Blackball");
		stack.push("Redball");
		
		System.out.println(stack.peek());
		
		System.out.println();
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
		System.out.println(stack.search("Redball"));
		
		System.out.println(stack.search("Blackball"));
		System.out.println(stack.indexOf("Blackball"));
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.empty()); // stack special method.
		
		
	

	}

}
