package d19_Loops2;

import java.util.Scanner;

public class dGiveMe5Dollars {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int dollar;
		int tries=1;  //say "you are mean person" if he doesn't give $5 after asking 3 times
		do {
			System.out.println("Give me 5 bucks");
			dollar=input.nextInt();
			}while(dollar!=5);
		System.out.println("Thanks for the money");
		
		
	}

}
