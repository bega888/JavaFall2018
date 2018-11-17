package d20_Loops3_ForLoop;

import java.util.Random;
import java.util.Scanner;

public class aGuessANumberVer3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Random random=new Random();  //	Random-class, random-object
		
		
		int guessedNumber, secretNumber=random.nextInt(100), tries=0;
		
		do{
			
			System.out.println("Guess the number:");
			guessedNumber=input.nextInt();
			tries++;
			if(guessedNumber==secretNumber) {
				System.out.println("Congratulations! You won!");
				break;                                            // is there better place to break? 
			}else if(guessedNumber>secretNumber){
				System.out.println("Too large");
			}else if(guessedNumber<secretNumber){
				System.out.println("Too small");
			}else{
				System.out.println("Wrong character");
			}
			if(tries==5) {
				System.out.println("You Lost!");
				System.out.println("Secret number is: "+secretNumber);
			}
			
			
			
		}while(secretNumber != guessedNumber && tries<=5);
		
		System.out.println("GAME OVER!");
		
	}

}
