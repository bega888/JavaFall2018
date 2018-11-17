package d04_operators;

import java.util.Scanner;
public class FahrenheitToCelsius {
	public static void main(String[] arg) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Fahrenheit:");
	int fahrenheit=input.nextInt();
	double celcius=(5.0/9)*(fahrenheit-32);  //"5.0/9"-to get 0.55, if we use "5/9" we will get 0.
	System.out.println(fahrenheit+" Fahrenheit is "+(int)celcius+" in celcius");
		
		
	input.close();
	
		
		
	}

}
