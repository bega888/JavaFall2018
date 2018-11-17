package j014_Multibranch_If;

import java.util.Scanner;

public class IfElseIfElse {
	public static void main(String[] args) {
		Scanner intake = new Scanner(System.in);
		// int i=12;
		//
		// if(i<5) {System.out.println("Less than 5");}
		// else if(i<10) {System.out.println("Less than 10");}
		// else if(i<15) {System.out.println("Less than 15");}
		// else {System.out.println("Not less than 5 or 10");}

		System.out.println("Enter your Exam Result:");
		double examResult = intake.nextDouble();
		char grade;
		if (examResult >= 90) {
			grade = 'A';
			System.out.println("your grade is " + grade);
		} else if (examResult >= 80) {
			grade = 'B';
			System.out.println("your grade is " + grade);
		} else if (examResult >= 70) {
			grade = 'C';
			System.out.println("your grade is " + grade);
		} else if (examResult >= 60) {
			grade = 'D';
			System.out.println("your grade is " + grade);
		} else {
			grade = 'F';
			System.out.println("your grade is " + grade);
		}
		System.out.println("the final grade is "+grade );
	}
}
