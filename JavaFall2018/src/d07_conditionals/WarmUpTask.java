package d07_conditionals;

import java.util.Scanner;

public class WarmUpTask {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//currency calculator
		double usd=1.1633399, eur=0.859594, gbp=0.774479, cny=6.829951, jpy=111.493, cad=1.317541, aud=1.390296;
		
		System.out.println("Enter the amount of dollars to be converted:");
		double usdInput=input.nextDouble();
		double converToEur=usdInput*eur;
		System.out.println(usdInput+" dollars = "+converToEur+" euros");
		
		System.out.println("Enter the amount of euros to be converted:");
		double eurInput=input.nextDouble();
		double converToUsd=eurInput*usd;
		System.out.println(eurInput+" euros = "+converToUsd+" dollars");
		
		
		
		
		
		
	}

}
