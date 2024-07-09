package jdbc;

import java.util.ArrayList;
import java.util.stream.Stream;

import batch6Pm.FacalityNew;

public class StreamDemo1 {

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
	   
	   
	   Stream<FacalityNew>facilityList=list.stream().filter(a->a.getFirstName().startsWith("s"));
	   
		//facilityList.forEach(a->System.out.println(a.getFirstName().toUpperCase()));
		
	   facilityList.forEach(System.out::println);
	  
	   
	   

	}

}
