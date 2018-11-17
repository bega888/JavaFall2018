package j017_WhileLoop;
import java.util.Random;    //built in Random class like Scanner
import java.util.Scanner;
public class NumberGuessing {
public static void main(String[] args) {
	Random randomNumber=new Random();
	int secretNumber=randomNumber.nextInt(100); //random numbers between 1-100
	System.out.println(secretNumber);
	Scanner intake=new Scanner(System.in);
	int myNumber;
	int attempts=1;
	do {
		System.out.println("Guess the secret number:");
		myNumber=intake.nextInt();
		if(myNumber==secretNumber) {
			System.out.println("Excellent");
		}else if(myNumber<secretNumber) {
			System.out.println("Too small");
			attempts++;
		}else if(myNumber>secretNumber) {
			System.out.println("Too big");
			attempts++;
		}
		System.out.println("Attempt: "+attempts);
		if(attempts>5) {
			System.out.println("You lost!");
			System.out.println("The secret number is "+secretNumber);
			break;
		}

	}while(secretNumber != myNumber);
	System.out.println("Congratulations, you won! The secret number is "+secretNumber);
}}
