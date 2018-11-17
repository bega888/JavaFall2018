package d05_operators;

public class OperatorsPractice {
	public static void main(String[] args) {
		
		/*declare variable apples and assign 5
		 * add 10 more apples using shorthand operator
		 * 
		 * declare variable carsInLot and assign 23
		 * decrease carsInLot by 10 using short hand operator
		 * 
		 * declare variable pizzaSlices and assign 12 to it
		 * divide pizzaSlices amoung 5 ppl and assign the amount
		 * each person gets back to pizzaSlices
		 * 
		 * declare variable minutes and assign 100 to it
		 * find out how many remaining minutes that do not make another hour
		 * and assign back to minutes 
		 */
		
		int apples = 5;
		apples +=10;
		System.out.println(apples);
		int carsInLot = 23;
		carsInLot -=10;
		System.out.println(carsInLot);
		int pizzaSlices = 12;
		pizzaSlices /=5;
		System.out.println("Each person gets "+pizzaSlices+" pizza slices.");
		int minutes = 100;
		minutes %=60;
		System.out.println("remaining minutes "+minutes);
		
		
		
		
	}

}
