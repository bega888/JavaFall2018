package j009_NonVoid;

public class AirConditioner {
	String model;
	int temperature;
	boolean on;
	
	public void turnOn() {
		System.out.println("turning on "+model); 
		on=true;
	}
	public void turnOff() {
		System.out.println("turning off "+model);
		on=false;
	}
	public void setTemperature(int temp) {
		System.out.println("setting current temperature to "+temp);
		temperature=temp;
	}
	public void turnUpTemperature(int add) {
		System.out.println("turning up current temperature by "+add);
		temperature=temperature+add;
	}


}

