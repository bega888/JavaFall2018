package d41_Constructors_Encapsulation;

import javax.print.attribute.standard.Destination;

public class Car {
	
	String make="Lexus RX890";
	boolean sportRdition;
	int year=2019, milage;
	
	
	
	public void drive() {
		System.out.println(year+" "+make+" is driving");
		milage +=10;
	}
	public void drive(String dectination) {
		System.out.println(year+" "+make+" is driving to "+dectination);
		milage +=10;
	}
	public void drive(int mile) {
		System.out.println(year+" "+make+" is driving "+mile+" miles.");
		milage +=mile;
	}
	 

	
	
	
	
}
