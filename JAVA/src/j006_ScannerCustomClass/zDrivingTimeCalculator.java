package j006_ScannerCustomClass;

import java.util.Scanner;
public class zDrivingTimeCalculator {
public static void main(String[] args) {
Scanner input=new Scanner(System.in);

	System.out.println("Please enter the distance in miles:");
	double destinationMiles=input.nextDouble();
	
	System.out.println("Please enter your speed in MPH:");
	double speedMPH=input.nextDouble();
	
	double time=destinationMiles/speedMPH*60;
	System.out.println("Total time to destination is "+time+" minutes");
	//I don't know how to make it x-hours, xx-minutes.
	
	
	
}
}
