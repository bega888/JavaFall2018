package d09_conditionals3;

import java.util.Scanner;

public class ShippingCalculator {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Purchase Price");
		double purchasePrice=input.nextDouble();
		int shippingMode=2; //1-Regular Shipping, 2-Express Shipping
		double shippingCost=0;
		
		if(shippingMode==1) {
			System.out.println("---Regular Shipping Selected---");
			if(purchasePrice>=1 && purchasePrice<=100) {
				shippingCost=17;
			}else if(purchasePrice>100 && purchasePrice<=300){
				shippingCost=10;
			}else if(purchasePrice>300){
				shippingCost=0;
			}
		
		}else if(shippingMode==2) {
			System.out.println("---Express Shipping Selected---");
			if(purchasePrice>=1 && purchasePrice<=100) {
				shippingCost=35;
			}else if(purchasePrice>100 && purchasePrice<=300){
				shippingCost=25;
			}else if(purchasePrice>300){
				shippingCost=15;
			}
		}
		
		
		
		
		
		
		
		System.out.println("Your shipping cost is: $"+shippingCost);
		
		
	}


}
