package j016_Switch;
import java.util.Scanner;
public class CarSalon {
public static void main(String[] args) {
	Scanner intake=new Scanner(System.in);

	System.out.println("What country's car do you want? \n We have German, American and Japanese cars");
	String country=intake.nextLine();
	//Price:American 3000, German 5000, Japanese 2000;
	System.out.println("What is your budget limit?");
	double budgetLimit=intake.nextDouble();
	
	if(country.equalsIgnoreCase("german")) {
		System.out.println("You selcted a German car!");
		if(budgetLimit>=5000) {
			System.out.println("We have a car for you");
		}else {
			System.out.println("Sorry, we don't have a German car that fits your budget limit!");
		}
	}else if(country.equalsIgnoreCase("american")) {
		System.out.println("You selected an American car!");
		if(budgetLimit>=3000) {
			System.out.println("We have a car for you");
		}else {
			System.out.println("Sorry, we don't have an American car that fits your budget limit!");
		}
	}else if(country.equalsIgnoreCase("japanese")) {
		System.out.println("You selected a Japanese car");
		if(budgetLimit>=2000) {
			System.out.println("We have a car for you");
		}
	}else {
		System.out.println("Sorry, we dont have a car that fits your budget limit!");
	}
}
}
