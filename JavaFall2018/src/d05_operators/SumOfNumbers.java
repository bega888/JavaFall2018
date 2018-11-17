package d05_operators;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		/*write a program that asks user to enter 3 numbers from keyboard
		 * and calculate the sum of those numbers, then show the result 
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first number:");
		int firstNum=input.nextInt();
		System.out.println("Enter second number:");
		int secondNum=input.nextInt();
		System.out.println("Enter third number:");
		int thirdNum=input.nextInt();
		int sum=firstNum+secondNum+thirdNum;
		System.out.println("Sum of the numbers entered is: "+sum);
		
		
		
		input.close();
				 
	}

}
