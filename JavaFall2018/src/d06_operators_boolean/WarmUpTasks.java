package d06_operators_boolean;

import java.util.Scanner;

public class WarmUpTasks {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		/*create a program that accepts value
		 * in miles and converts into kilometers
		 */
		System.out.println("Enter miles:");
		double miles=input.nextDouble();
		double  kilometers=miles*1.6;
		System.out.println(miles+" miles is equal to "+kilometers+" in kilometers");
		
		/*write a program that asks user to enter current car odometer miles
		 * and previous car odometer miles. Also number of gallons that was put.
		 * Price per gallon 
		 */
		System.out.println("Enter current car odometer:");
		int currentOdo=input.nextInt();
		System.out.println("Enter previous car odometer:");
		int previousOdo=input.nextInt();
		System.out.println("Enter the number of gallons put:");
		int gallons=input.nextInt();
		System.out.println("Price of the gas per gallon:");
		int gasPrice=input.nextInt();
		int fillExpense=gallons*gasPrice;
		int gasMilage=(currentOdo-previousOdo)/gallons;
		
		System.out.println("Your fill expence was: $"+fillExpense);
		System.out.println("Your avarage gas milage was: "+gasMilage+" MPG");
		
		//INCREMENT and DECREMENT
		// int a=10;
		// a++;  -> adding one
		// int b=15;
		// b--;
		
		
		
	}

}
