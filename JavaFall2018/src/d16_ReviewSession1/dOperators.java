package d16_ReviewSession1;

public class dOperators {
	public static void main(String[] args) {
		/*
		 * arithmetic operators: +, -, *, /, %
		 * shorthand assignment: +=, -+, *=, /=, %=
		 * increment/decrement: ++, --
		 * comparison: >, >=, ==, !=, <, <=
		 */
		
		int paceMPH=30;
		double distanceMiles=50;
		double timeInMinutes=distanceMiles/paceMPH*60;
		int hours=(int)(timeInMinutes%60);
		System.out.println("To get to your destination it will take: "+hours+" hours and "+timeInMinutes+" minutes");
		
		
		
		
		
		
	}

}
