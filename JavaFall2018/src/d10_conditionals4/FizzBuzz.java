package d10_conditionals4;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any number:");
		int number=input.nextInt();
		
		
		if(number%15==0) {    //(number%3==0 && number%5==0)  both will work
			System.out.println("both 3 and 5 -> FizzBuzz");
		}else if(number%5==0) {
			System.out.println("devided by 5 -> BUZZ");
		}else if(number%3==0) {
			System.out.println("devided by 3 -> FIZZ"); 
		}else {
			System.out.println("Enter another number");
		}
		
		
		
	
		
		
		
		
		
	}
	
}
