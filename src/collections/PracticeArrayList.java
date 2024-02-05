package collections;
//import java.util.ShapeName;

import java.util.ArrayList;

public class PracticeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=90;
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(23);
		al.add(i);
		al.add(78);
		al.add(23);
		//ShapeName square=()->System
		al.forEach((n)->System.out.println(n));

	}

}
