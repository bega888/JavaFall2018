package j006_ScannerCustomClass;

import java.util.Scanner;
public class Groceries {
	public static void main(String[] args) {
		Scanner intake=new Scanner(System.in);
		System.out.println("How much did you spent on Groceries?");
		double spentGroceries=intake.nextInt();
		System.out.println("How many people contributed?");
		int peopleContributed=intake.nextInt();
		double perPerson=spentGroceries/peopleContributed;
		System.out.println("Contribution for each person is $:"+perPerson);
		
		
		
		
	}

}
