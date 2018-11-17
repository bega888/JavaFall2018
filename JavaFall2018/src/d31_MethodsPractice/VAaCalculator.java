package d31_MethodsPractice;

import java.util.Scanner;

public class VAaCalculator {
	public static void main(String[] args) {
		//double x=2.3, y=1.2; //front-end user comes up with his variable name 
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		double x=input.nextDouble();
		double y=input.nextDouble();
		System.out.println("Chose from the options below:\n"
				+ "1 for addition\n"
				+ "2 for substraction\n"
				+ "3 for multiplication\n"
				+ "4 for devicion\n");
		
		int calc=input.nextInt();  //like a Scanner for Switch 
		switch(calc) {
		case 1:
			add(x, y);
			break;
		case 2:
			substract(x, y);
			break;
		case 3:
			multiply(x, y);
			break;
		case 4:
			devide(x, y);
			break;
		default:
			System.out.println("ERROR: Invalid operation");
			break;
		}
					
	}

	static void add(double a, double b) { 
		double add=a+b;
		System.out.println("addition result is: "+add);
	}
	private static void substract(double a, double b) {
		double substract=a-b;
		System.out.println("substraction result is: "+substract);
	}
	static void multiply(double a, double b) {
		double multiply=a*b;
		System.out.println("multiplication result is: "+multiply);
	}
	private static void devide(double a, double b) {
		if(b==0) {
			System.out.println("ERROR: Cannot divide by 0");
		}else{
			double devide=a/b;
		System.out.println("devision result is: "+devide);
	}
	
	}

}
