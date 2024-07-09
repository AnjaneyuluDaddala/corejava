package arrayListAssignment;

import java.util.ArrayList;

public class MainArrayList {

	public static void main(String[] args) {
		
		
		Mobiles redmi=new Mobiles("Redmi 13 c",10000);
		Mobiles poco=new Mobiles("Poco c 51",15000);
		Mobiles realme=new Mobiles("realme narzo N53",20000);
		
		ArrayList<Mobiles> mobileslist=new ArrayList<>();
		mobileslist.add(redmi);
		mobileslist.add(poco);
		mobileslist.add(realme);
	
	 
	   
	   
	   
	   //mobiles complete
	   
	  SmartWatches boat=new  SmartWatches("boAt Wave Sigma","black",2.01);
	  SmartWatches noise=new  SmartWatches("Noise Pulse 2 Max","blue",1.05);
	  SmartWatches apple=new  SmartWatches("Apple Watch SE (2nd Gen)","Midnight",40);
	   
	  ArrayList<SmartWatches> SmartWatchesList= new ArrayList<>();
	  
	   SmartWatchesList.add(boat);
	   SmartWatchesList.add(noise);
	   SmartWatchesList.add(apple);
	  
	   
	   //smartwatches complete
	   
	   
	      Laptops lenovoBrand= new  Laptops("Lenovo IdeaPad",15.6,"Arctic Grey");
		  Laptops appleBrand= new  Laptops("Apple 2023 MacBook Pro",14,"Space Grey");
		  Laptops dellBrand= new  Laptops("Dell 14 Laptop",14,"Black");
		   
		  ArrayList<Laptops>LaptopList= new ArrayList<>();
		  
		   LaptopList.add(lenovoBrand);
		   LaptopList.add(appleBrand);
		   LaptopList.add(dellBrand);
		  
	 // laptops complete
		   
		
	   ArrayList<ArrayList> ElectronicArrayList =new ArrayList<>();
	   
	   ElectronicArrayList.add(SmartWatchesList);
	   ElectronicArrayList.add(LaptopList);
	   
		// adding electronic is complete
		
		
		
	   
	   // finally allList are added to the main bar List.
		
		ArrayList<ArrayList> MainArrayList=new ArrayList<ArrayList>();
		
		MainArrayList.add(0, mobileslist);
		MainArrayList.add(1, ElectronicArrayList);
		
	
		System.out.println(MainArrayList);
		
		//System.out.println(MainArrayList.get(0));
		
		System.out.println(MainArrayList.get(1));
		
        ArrayList<ArrayList> Electroniclist= MainArrayList.get(1);
		
		ArrayList<SmartWatches> Watchlist= Electroniclist.get(0);
		ArrayList<Laptops> laptop= Electroniclist.get(1);
		
		System.out.println(Watchlist.get(0));
		
		System.out.println(laptop.get(1));
		
		
		
		
	}

}
