package d09_conditionals3;

import java.util.Scanner;

public class RushHourTollCalculator {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the miles:");
		int miles=input.nextInt();
		boolean isRushHour=false;
		double tollCost=0;
		
		if(miles>0 && miles<=100) {
			if(isRushHour==true) {
				tollCost=10;
			}else {
				tollCost=5;
			}
			
		}else if(miles>100 && miles<=500) {
			if(isRushHour==true) {
				tollCost=16;
			}else {
				tollCost=8;
			}
			
		}else if(miles>500 && miles<=1000) {
			if(isRushHour==true) {   // "isRushHour==true" or just "isRushHour" will work just fine
				tollCost=20;
			}else {
				tollCost=10;
			}
			
		}else if(miles>1000) {
			if(isRushHour==true) {
				tollCost=24;
			}else {
				tollCost=12;
			}
			
		}else {
			System.out.println("Cannot be a negative or 0 distance");
		}
		
		if(miles>0)
		System.out.println("Toll Cost: "+tollCost);
	
	
	
	
	
	}
}
	
		
/*if(miles>0 && miles<=100 && isRushHour==true) {   ->this is also acceptable 
	tollCost=10;
	}else {
		tollCost=5;
	}
*/
	

