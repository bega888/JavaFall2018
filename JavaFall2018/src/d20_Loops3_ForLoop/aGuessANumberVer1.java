package d20_Loops3_ForLoop;

import java.util.Random;
import java.util.Scanner;

public class aGuessANumberVer1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Random random=new Random();  //	Random-class, random-object
		
		//give me random number between 0-50
		System.out.println(random.nextInt(50));
		//give me any positive double number
		System.out.println(random.nextDouble());
		//random true/false
		System.out.println(random.nextBoolean());
		
		int guessedNumber, secretNumber=random.nextInt(10);
		
		do{
			
			System.out.println("Guess the number:");
			guessedNumber=input.nextInt();
			
			if(guessedNumber==secretNumber) {
				System.out.println("Congratulations! You won!");
			}else {
				System.out.println("Incorrect guess. Try again");
			}
			
			
		}while(secretNumber != guessedNumber);
		
		
		
	}

}
