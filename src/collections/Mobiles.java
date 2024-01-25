package collections;

public class Mobiles extends Choosen { 
	
	String mobileName;
	double originalPrice;

	
	Mobiles(String mobileName,double originalPrice){
	
		this.mobileName=mobileName;
		this.originalPrice=originalPrice;
		
	}
     void Discount(double DiscountPrice){
    	 System.out.println("Discountprice"+DiscountPrice);
	
	}
	
	void MobileFeatures(String Ram,String Storage,String Battery) {
		
		
		
		System.out.println("speed of RAM "+Ram);
		System.out.println("storage "+Storage);
		System.out.println("Battery life"+Battery);
		
	}
	
	

	
		

	}


