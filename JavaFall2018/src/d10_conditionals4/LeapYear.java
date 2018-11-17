package d10_conditionals4;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a year to find if it is a leap year:");
		int leapYear=input.nextInt();
		
		
		if(leapYear%400==0 || (leapYear%4==0 && leapYear%100!=0)) {
			System.out.println(leapYear+" is a leap year.");
		}else {
			System.out.println(leapYear+" is not a leap year.");
		}
		
				
	}

}



/*
		if(leapYear%400==0) {
			System.out.println(leapYear+" is a leap year.");
		}else if(leapYear%4==0 && leapYear%100!=0){
			System.out.println(leapYear+" is a leap year.");
		}else{
			System.out.println(leapYear+" is not a leap year.");
		}
	
*/