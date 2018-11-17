package d09_conditionals3;

import java.util.Scanner;

public class CreditScore {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your credit score:");
		int creditScore=input.nextInt();
		String creditStatus="unknown";  //there is a chance that non of the boolean conditions could 
		int percantage=0;               //be true, so compiler asks initial value.
		
		if(creditScore>=800 && creditScore<=850) {
			creditStatus="Excellent";
			percantage=20;
		}else if(creditScore>=740 && creditScore<=799) {
			creditStatus="Very Good";
			percantage=25;
		}else if(creditScore>=670 && creditScore<=739) {
			creditStatus="Good";
			percantage=21;
		}else if(creditScore>=580 && creditScore<=669) {
			creditStatus="Fair";
			percantage=18;
		}else if(creditScore>=300 && creditScore<=579) {
			creditStatus="Very Poor";
			percantage=16;
		}else if(creditScore>0 && creditScore<=299) {
			creditStatus="Bad Credit";
			percantage=0;
		}else if(creditScore==0) {
			creditStatus="No Credit History";
		}else if (creditScore <0 || creditScore >850){
			System.out.println("Invalid Credit Score. Cannot be negative or more thatn 850");
		} 
		System.out.println(creditStatus);
		System.out.println("Precentage in USA: %"+percantage);
		
		
		
	}

}
