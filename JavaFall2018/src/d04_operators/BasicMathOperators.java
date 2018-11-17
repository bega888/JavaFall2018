package d04_operators;

public class BasicMathOperators {
	public static void main(String[] args) {
	//create 2 int variables and assign values
		int num1=100;
		int num2=200;
		System.out.println(num1+num2); 
		System.out.println(num1+num2+1000); 
		int sum=num1+num2;
		System.out.println("sum is "+sum);
		
		//create 3 variables:apples, carrots, tomatoes
		//add prices to it with decimals
		//create a variable called total and assign total price
		//also print the tax then add the task to the total
		//print your total is total price with tax
		
		double apples, carriots, tomatoes, totalBeforeTax, tax, totalWithTax;
		apples=10.55;
		carriots=3.87;
		tomatoes=6.23;
		totalBeforeTax=apples+carriots+tomatoes;
		tax=totalBeforeTax*0.06;
		totalWithTax=totalBeforeTax+tax;
		System.out.println("Total before tax: $"+totalBeforeTax);
		System.out.println("Total tax is: $"+tax);
		System.out.println("Total after tax: $"+totalWithTax);
		
		
		
		
		
		
		
		
	}
	
}
