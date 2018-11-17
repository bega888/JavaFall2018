package d07_conditionals;

import java.util.Scanner;

public class OfficeHours {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 1st decimal number:");
		double num1=input.nextDouble();
		System.out.println("Enter 2nd decimal number:");
		double num2=input.nextDouble();
		double sum=num1+num2;
		System.out.println("The sum of the numbers are: " +sum);
		
		
		System.out.println("Enter a number:");
		float num=input.nextFloat();
		System.out.println(num *=num);
		System.out.println(num *=num);
		System.out.println(num *=num);
		
		
		
		
		
	}

}
