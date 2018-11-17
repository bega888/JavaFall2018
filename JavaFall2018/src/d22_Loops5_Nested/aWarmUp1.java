package d22_Loops5_Nested;

import java.util.Scanner;

public class aWarmUp1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("---WELCOME TO OUR STORE---\n");
		
		System.out.println("How many items do you have:");
		int items=input.nextInt();
		
		String allItems="";
		double totalPrice=0;
		
		
		for(int i=1; i<=items; i++) {
		
			System.out.println("What is the item "+i);
			String item=input.next();
			
			System.out.println("How much is the "+item+" ?");
			double price=input.nextDouble();
			if(i==items) {
				allItems=allItems+item;
			}else {
				allItems=allItems+item+", ";
			}
			
			totalPrice=totalPrice+price;
					
		}
		
		
		 
		
		System.out.println("Your items: "+allItems);
		System.out.println("Your total ptice is: $"+totalPrice);
		 
	}

}
