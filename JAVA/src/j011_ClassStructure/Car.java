package j011_ClassStructure;

public class Car {

	String model;
	String color;
	int currentSpeed;
	
	public void printCarInformation() {
		System.out.println(color+" "+model+" is driving "+currentSpeed+" mph.");
	}
	//-------------------------------------------------------------------------------------
	public void accelerate(int moreSpeed) {
		currentSpeed=currentSpeed+moreSpeed;
		System.out.println("acceleration to "+ currentSpeed);
	}
	public int getCurrentSpeed() {   //returns value
		return currentSpeed;
		
	}
	
}
