package d20_Loops3_ForLoop;

import java.util.Random;
import java.util.Scanner;

public class aGuessANumberVer2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Random random=new Random();  //	Random-class, random-object
		
		
		int guessedNumber, secretNumber=random.nextInt(100);
		
		do{
			
			System.out.println("Guess the number:");
			guessedNumber=input.nextInt();
			
			if(guessedNumber==secretNumber) {
				System.out.println("Congratulations! You won!");
			}else if(guessedNumber>secretNumber){
				System.out.println("Too large");
			}else if(guessedNumber<secretNumber){
				System.out.println("Too small");
			}else{
				System.out.println("Wrong character");
			}
			
			
		}while(secretNumber != guessedNumber);
		
		
		
	}

}
