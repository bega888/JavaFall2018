package j019_ForLoop;

import java.util.Scanner;

public class LoopRunner {
	public static void main(String[] args) {
		Scanner intake = new Scanner(System.in);
		
		System.out.println("Enter starting number");
		int num1 = intake.nextInt();
		System.out.println("Enter ending number");
		int num2 = intake.nextInt();
		
		Looper looper = new Looper();
		int somofNumbers=looper.loopAndSum(num1, num2);
		System.out.println("Sum of numbers is "+ somofNumbers);
		
		
		
	}

}
