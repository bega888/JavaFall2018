package j006_ScannerCustomClass;

import java.util.Scanner;
public class zDogFoodCalculator {
public static void main(String[] args) {
Scanner intake=new Scanner(System.in);

System.out.println("Enter the number of dogs:");
int numOfDogs=intake.nextInt();
System.out.println("Enter the number of days:");
int numOfDays=intake.nextInt();

int wetFoodPerDay=57;
int dryFoodPerDay=28;
int veggiesPerDay=57;
int totalWetFood=numOfDogs*numOfDays*wetFoodPerDay;
int totalDryFood=numOfDogs*numOfDays*dryFoodPerDay;
int totalVeggies=numOfDogs*numOfDays*veggiesPerDay;
System.out.println(numOfDogs+" dogs in "+numOfDays+" days will need:");
System.out.println(totalWetFood+" grams of wet food and,");
System.out.println(totalDryFood+" grams of dry food and,");
System.out.println(totalVeggies+" grams of veggies food.");
	
	
}
	
}
