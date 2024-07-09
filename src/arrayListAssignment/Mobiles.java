package arrayListAssignment;

public class Mobiles extends Platform { 
		

		private String mobileName;
		private double originalPrice;

		
   public Mobiles(String mobileName,double originalPrice){
		
			this.mobileName=mobileName;
			this.originalPrice=originalPrice;
			
		}
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
		@Override
		public String toString() {
			return "Mobiles [mobileName=" + mobileName + ", originalPrice=" + originalPrice + "]";
		}
		
		
}
