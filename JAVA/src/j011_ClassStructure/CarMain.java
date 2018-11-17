package j011_ClassStructure;

public class CarMain {
	public static void main(String[] args) {
		Car car1=new Car();
		car1.model="Toyora Camry";
		car1.color="Red";
		car1.currentSpeed=40;
		
		car1.printCarInformation();
		car1.accelerate(35);
		car1.getCurrentSpeed();
		
		
		
	}

}
