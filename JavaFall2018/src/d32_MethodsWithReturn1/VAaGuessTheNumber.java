package d32_MethodsWithReturn1;

import java.util.Random;

public class VAaGuessTheNumber {
	public static void main(String[] args) {
		guessNumCompOnly();
		
	}
	public static void guessNumCompOnly(){  //you can put limit as an argument
		Random random=new Random();
		int secretNumber=random.nextInt(25);
		int counter=0;
		do {
			counter++;
			System.out.println("Guess the secter number:");
			int guessNumber=random.nextInt(25);
			System.out.println("Guessing: "+guessNumber+" Counter: "+counter);
			if(guessNumber==secretNumber) {
				System.out.println("You won!");
				break;
			}else {
				System.out.println("Wrong! Try again");
			}							//if counter==limit "game over!" break; 
		}while(true);
		
	}
	
	
	
	
	
}
