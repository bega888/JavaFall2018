package d05_operators;

import java.util.Scanner;

public class CoinsCalculator {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the count of penniesyou have:");
		int pennies=input.nextInt();
		
		int dollars=pennies/100;
		pennies %=100;
		int quarters=pennies/25;
		pennies %=25;
		int dimes=pennies/10;
		pennies %=10;
		int nickels=pennies/5;
		pennies %=5;
			
		
		System.out.println("That is "+dollars+" dollars and "+quarters+" quarters "+dimes+" dimes "+nickels+
				" nickels and "+pennies+" pennies");
		
		
		
		
		
		
		
		
		
		
	}

}
