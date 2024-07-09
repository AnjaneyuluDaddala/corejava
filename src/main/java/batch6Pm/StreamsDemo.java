package batch6Pm;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		 ArrayList<FacalityNew> list=new ArrayList<>();
		 
		 //Jdbc  Resultset
		 
	   FacalityNew f1=new FacalityNew(12,"kirak","sowmya","hyd","Ap",15000,8);
	   FacalityNew f2=new FacalityNew(13,"jawala","pradeep","hyd","Ap",10000,6);
	   FacalityNew f3=new FacalityNew(14,"lela","sampath","hyd","Ap",20000,9);
	   FacalityNew f4=new FacalityNew(15,"mala","shylu","hyd","Ap",340000,10);
	   
	  
	   list.add(f1);
	   list.add(f2);
	   list.add(f3);
	   list.add(f4);
	   
	   for(FacalityNew list1:list) {
		   System.out.println(list1);
	   }
	   
	   //Filter operation
	   Stream<FacalityNew> facalityList=list.stream().filter(a->a.getRating()<9);
	  // facalityList.forEach(x->System.out.print(x));
	   List<FacalityNew> list2=facalityList.collect(Collectors.toList());
	   System.out.println(list2);
	   
	   //Map Operation
	   Set<Double> map=list.stream().map(a->a.getSalary()*0.10).collect(Collectors.toSet());
	   System.out.println(map);
	   

	

}
}
