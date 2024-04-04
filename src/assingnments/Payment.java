package assingnments;

@FunctionalInterface
public interface Payment  {
	
	 void paymentPrice(double price);
	 
	 static void  mobileDetails(String name,double price) {
		 System.out.println("The mode name is "+name);
		 System.out.println("The  price is = "+price);
	}

}
