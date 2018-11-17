package d16_ReviewSession1;

public class aPrintAMessage {
	public static void main(String[] args) {   //(String[] args) vs (String... args) []-array, ...-what args, args-default naming, but can be named differently
		System.out.println("Welcome to Review Session");
		System.out.println(23); //Numbers can be printed without " " double quotes.
		System.out.println("Topic 1 is: "+"Printing messages");  //+ is concatanation
		
		int balance=100;
		System.out.println("Balance is: "+balance+55);  // 55 will be attached to String "100", so the output is ->10055  PS:multiple pluses will run left->right
		System.out.println("Balance is: "+(balance+55)); // either use parenthesis to get desired output or change the order
		System.out.println(balance+55+" is the current balance");
		
		// print vs println = "ln" will press Enter after printing, so next print statements will be printed in the next line
		System.out.print("Today is Java");
		System.out.print("Tomorrow is Mava");
		System.out.print("Then will come Kava");  
		System.out.println();
		System.out.println("Today is Java");
		System.out.println("Tomorrow is Mava");
		System.out.println("Then will come Kava");  
		
		System.out.print("Today is Java \n"); //	\n=="ln", \n can be used in the middle as well ("Then will \n come Kava") 
		System.out.print("Tomorrow is \\n Mava \n"); //	\\n-"\n" will be treated as string 
		System.out.print("Then will come Kava \n"); //	\-is called	escape and can be used to treat following character as String, as in \", \\n	
		
		System.out.println("I want to buy 'wooden spoon' from \"etsy\" ");
		
		
		
		
	}

}
