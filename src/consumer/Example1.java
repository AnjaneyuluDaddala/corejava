package consumer;

import java.util.function.Consumer;

class Person{
	private String name;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
}
public class Example1 {

	public static void main(String[] args) {
		Person p=new Person();
		
		Consumer<Person>per=name->name.setName("ravi");
		per.accept(p);
		System.out.println(p.getName().toUpperCase());
		
	}

}
