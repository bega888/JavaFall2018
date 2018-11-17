package d04_operators;

import java.util.Scanner;
public class AgeCalculatorWithScanner {
	public static void main(String[] agrs) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the current year:");
		int currentYear=scan.nextInt(); 
		System.out.println("Enter the year of birth:");
		int yearOfBirth=scan.nextInt();  
		int age=currentYear-yearOfBirth;
		System.out.println("You are "+age+" years old.");
				
		
		
		
		
		scan.close();
		
		
		
		
	}

}
