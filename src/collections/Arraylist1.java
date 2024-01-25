package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Arraylist1 {
	/*
	void  mobileList() {
		ArrayList<Mobiles>mobileList =new ArrayList<Mobiles>();
		
		Mobiles samsung= new Mobiles("Samsung Galaxy M04 Light Green",11999.0);
		
		System.out.println("mobile Name "+samsung.mobileName);
		System.out.println("OriginalPrice "+samsung.originalPrice);
		samsung.Discount(7999.0);
		samsung.MobileFeatures("4GB RAM", "64GB","5000 mAh Battery" );
		
		
		
		Mobiles onePlus=new Mobiles("OnePlus Nord CE 3 Lite",25000);
		
		System.out.println("mobile Name "+onePlus.mobileName);
		System.out.println("OriginalPrice "+onePlus.originalPrice);
		onePlus.Discount(19999);
		onePlus.MobileFeatures("8GB RAM", "128GB","5000 mAh  Battery" );
		
	}
	*/

	public static void main(String[] args) {
		
		
		ArrayList<Mobiles>mobileList =new ArrayList<Mobiles>();
		Mobiles samsung= new Mobiles("Samsung Galaxy M04 Light Green",11999.0);
		
		System.out.println("mobile Name "+samsung.mobileName);
		System.out.println("OriginalPrice "+samsung.originalPrice);
		samsung.Discount(7999.0);
		samsung.MobileFeatures("4GB RAM", "64GB","5000 mAh Battery" );
		
		System.out.println();
		
		Mobiles onePlus=new Mobiles("OnePlus Nord CE 3 Lite",25000);
		
		System.out.println("mobile Name "+onePlus.mobileName);
		System.out.println("OriginalPrice "+onePlus.originalPrice);
		onePlus.Discount(19999);
		onePlus.MobileFeatures("8GB RAM", "128GB","5000 mAh  Battery" );
		
		
		
		mobileList.add(samsung);
		mobileList.add(onePlus);
		
        HashMap<String,ArrayList> amazon=new HashMap<String,ArrayList>();
		
		
		
		amazon.put("mobiles",mobileList);
		
	     amazon.get(mobileList);
		
		 Iterator iterator=amazon.get(mobileList).iterator();
		
		while(iterator.hasNext()) {
			System.out.println("List item : -"+iterator.next());
		}

	}

}
