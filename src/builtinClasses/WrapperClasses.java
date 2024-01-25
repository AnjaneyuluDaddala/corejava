package builtinClasses;

import java.util.ArrayList;

public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=30;
		
		/*
		 * data types-->wrapper classes
		 * int--->Integer
		 * byte-->Byte
		 * short-->Short
		 * double-->Double
		 * float-->Float
		 * long-->Long
		 * char-->Character
		 * boolean-->Boolean
		 */
		
		WrapperClasses wp=new WrapperClasses();
		//Integer i1=new Integer();// not available default constructor in wrapper classes. bcz we need to store the some value
		
		Integer i2 =new Integer(44); ///in java 9 it is duplicated so it is cross mark.// it is boxing ,we assign the value
		
		Integer i3 =new Integer(i);// boxing ,we wrapped primitive data type in in the i
		System.out.println(i2);
		System.out.println(i3);
		 
		Integer i4 =i; // auto-boxing
		System.out.println(i4);
		
		
		Integer i5 =Integer.valueOf(i); // boxing
		
		
		Integer i6 =Integer.valueOf(i);
		int ii=i6.intValue(); // unboxing bcz obj inside data type value taking out and assign in the another same data type.
		int ii1=i6; // auto-unboxing. java converts automatically.
		System.out.println(ii);
   
		
		// collection
		
	//	ArrayList<int> al =new ArrayList<>(); //error bcz it is integer primitive datatype 
		ArrayList<Integer> al =new ArrayList<>();
		
		al.add(23);//not error bcz of auto-boxing
		al.add(i);//not error bcz of auto-boxing
		
		al.add(Integer.valueOf(i)); // boxing manually
		al.add(Integer.valueOf(32)); // boxing manually
		
		int age=al.get(0); // auto -unboxing in the index 0 value =x
		Integer age1=al.get(0);
		
		
		// conversion (converting one datatype to another datatype..)
		byte x=12;
		double y=23.9;
		short s= (short) y; // explicity we are changing datatype..
		
		String s1 ="19";
		
		//int age3= (int)s; // doesnot cast
		
		int age2= Integer.valueOf(s1) ;// it is returns wrapper class intansce ---it is done auto-boxing performance decrease
		
		Integer age4= Integer.valueOf(s1) ;
		int age33=age4.intValue();
		
   
		int age3= Integer.parseInt(s1) ; // it is directly returns primitive datatype --it is good
		 
		System.out.println("age is converted string to int =" + ++age3);
		
		Long age5 = Long.parseLong(s1);
		
		Long age7=Long.valueOf(s1);
		
		//int age55=age7; //error
		// int age55=age7.longValue();
		
		
		Integer iii99=34;
		int i0=10;
		
	}

}
