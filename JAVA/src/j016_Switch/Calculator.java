package j016_Switch;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner intake = new Scanner(System.in);

		int n1, n2;
		String operator;

		System.out.println("Please enter your 1st number:");
		n1 = intake.nextInt();
		System.out.println("Please enter your 2nd number:");
		n2 = intake.nextInt();
		System.out.println("Please enter your operator sign, ex: +, -, *, / ");
		operator = intake.next();

		if (operator.equals("+")) {
			System.out.println("The result is: " + (n1 + n2));
		} else if (operator.equals("-")) {
			System.out.println("The result is: " + (n1 - n2));
		} else if (operator.equals("*")) {
			System.out.println("The result is: " + (n1 * n2));
		} else if (operator.equals("/")) {
			if (n1 != 0) {
				System.out.println("The result is: " + (n1 / n2));
			} else {
				System.out.println("Cannot devide by 0, try another number");
			}
		} else {
			System.out.println("you didn't enter valid variables");
		}
	}

	public void printAllArrayNumbers(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		
	}
}
