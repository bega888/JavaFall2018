package d12_ClassAndObject;

import java.util.Scanner;

public class GetBeverage {
public static void main(String[] args) {
	
	String drink="water";
	double price;
	
	switch(drink){
		case "tea":
		case "TEA":
			price=3;
			break;
		case "coffee":
		case "COFFEE":
			price=4;
			break;
		case "water":
		case "WATER":
			price=2;
			break;
		case "juice":
		case "JUICE":
			price=5;
			break;
			default:
				System.out.println("Invalid drink");
				return;
	}
	System.out.println("Your total is $"+price);
	
	Scanner input=new Scanner(System.in);
	System.out.println("Choose your drink by typing:");
	String drinkT=input.next();
	String priceT="0";
	if(drinkT=="tea") {
		priceT="$3";
	}else if(drinkT=="coffee") {
		priceT="$4";
	}else if(drinkT=="water") {
		priceT="$2";
	}else if(drinkT=="juice") {
		priceT="$5";
	}else {
		System.out.println("Invalid drink");
	}System.out.println("Your "+drinkT+" price is "+priceT);
	
}
}
