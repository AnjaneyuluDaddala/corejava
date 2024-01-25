package interfaceCore;

public class MRF implements Tyres,NewUpdate{
  
  

  
	@Override
	public int placeOrder(int numberOfTyres) {
		System.out.println("The order is placed....in MRF TYRES");
		System.out.println("The no.of tyres given order is = "+numberOfTyres);
		return numberOfTyres;
	}

	@Override
	public void diameterTyres(double radius) {
		// TODO Auto-generated method stub
		double d=radius/2;
		System.out.println("The diameter of tyres are = "+d);
		
		
		
	}

	@Override
	public TyresDetails CostOfTyres(int costOfEachTyres,int numberOfTyres) {

		TyresDetails details = new TyresDetails();
		details.setCostOfEachTyres(costOfEachTyres);
		details.setNumberOfTyres(numberOfTyres);
		int totalCost= costOfEachTyres*numberOfTyres;
		details.setTotalCost(totalCost);
		
		return details;
		
	}

}
