package collections;

public class Mobiles extends Choosen { 
	
	 public Mobiles(String mobileName, double originalPrice) {
		super();
		this.mobileName = mobileName;
		this.originalPrice = originalPrice;
	}

	String mobileName;
	 double originalPrice;

	
    public void Discount(double DiscountPrice){
    	 System.out.println("Discountprice"+DiscountPrice);
	
	}
	
	public void MobileFeatures(String Ram,String Storage,String Battery) {
		
		
		
		System.out.println("speed of RAM "+Ram);
		System.out.println("storage "+Storage);
		System.out.println("Battery life"+Battery);
		
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	}


