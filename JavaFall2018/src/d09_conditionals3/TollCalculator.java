package d09_conditionals3;

import java.util.Scanner;

public class TollCalculator {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the miles:");
		int miles=input.nextInt();
		
		double tollCost=0;
		if(miles>0 && miles<=100) {
			tollCost=5;
		}else if(miles>=101 && miles<=500) {
			tollCost=8;
		}else if(miles>=501 && miles<=1000) {
			tollCost=10;
		}else if(miles>=1001) {
			tollCost=12;
		}else {
			System.out.println("Cannot be a negative distance");
		}
		if(miles>0)
		System.out.println("For "+miles+" miles toll costs: $"+tollCost);
		
		
		
		
		
		
		
		
		
	}

}
