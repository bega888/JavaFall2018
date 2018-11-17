package j012_operatorsIfElse;

import java.util.Scanner;
public class InvestmentMain {
public static void main(String[] args) {
	Scanner intake=new Scanner(System.in);
	
	System.out.println("Enter investment amount:");
	int investmentAmount=intake.nextInt();
	System.out.println("Enter the rate %:");
	double investmentRate=intake.nextInt();
	System.out.println("Enter the investment years:");
	int investmentYears=intake.nextInt();
	
//	double interestAmount=(investmentAmount/100*investmentRate)*investmentYears;
//	double investmentValue=(interestAmount+investmentAmount);
//	System.out.println(investmentValue);
	
	Investment investment=new Investment();
	double totalInvestmentValue=investment.calculateInvestmentValue(investmentAmount, investmentRate, investmentYears);
	



}
}
