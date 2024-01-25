package interfaceCore;

public interface Tyres {
	
	final static double pi=3.14;

	int  placeOrder( int numberOfTyres);
	void diameterTyres(double radius);
	TyresDetails CostOfTyres(int costOfEachTyres,int numberOfTyres);

}
