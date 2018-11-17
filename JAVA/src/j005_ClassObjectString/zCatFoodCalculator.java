package j005_ClassObjectString;

public class zCatFoodCalculator {
	public static void main(String[] args) {
		
		byte days=14;
		short cats=3;
		double dryFood=0.12;
		double wetFood=0.19;
		double totalDryFood=dryFood*cats*days;
		double totalWetFood=wetFood*cats*days;
		
		System.out.println(cats+" cats will eat "+totalWetFood+" lb of wet food and "+totalDryFood+" lb of dry food in "+days+" days.");
		
		
		
		
	}

}
