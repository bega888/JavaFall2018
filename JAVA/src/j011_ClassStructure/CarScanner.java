package j011_ClassStructure;
import java.util.Scanner;

public class CarScanner {
	public static void main(String[] args) {
		//1) get all values from console
		Scanner input=new Scanner(System.in);
		System.out.println("Putting a new car to the road....");
		
		System.out.println("Chhose your car model:");
		String carModel=input.next();//assigning the input to a new Variable
		
		System.out.println("Chhose your car color:");
		String carColor=input.next();
		
		System.out.println("Chhose your car's current speed");
		int carSpeed=input.nextInt();
		//2) creating the car object using the values entered
		Car yourCar=new Car();
		yourCar.model=carModel;
		yourCar.color=carColor;
		yourCar.currentSpeed=carSpeed;
			
		yourCar.printCarInformation();
		
		yourCar.accelerate(35);
		
		yourCar.printCarInformation();
		yourCar.getCurrentSpeed();
		System.out.println(yourCar.getCurrentSpeed());
		
		
	System.out.println("-----------------------------------------------------------------");
	//---------------------------------------------------------------------	
	
	
	
	
	}

}
