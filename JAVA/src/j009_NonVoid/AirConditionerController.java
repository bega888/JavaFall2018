package j009_NonVoid;

public class AirConditionerController {
	public static void main(String[] args) {
		AirConditioner a1=new AirConditioner();
		a1.model="Samsung";
		a1.on=false;
		a1.temperature=64;
				
		System.out.println(a1.temperature);  //64
		System.out.println(a1.on);           //false
		
		a1.turnOn();                        //turning on Samsung
		System.out.println(a1.on);         //true
		
		a1.turnOff();                      //turning off Samsung
		System.out.println(a1.on);         //false
		
		a1.setTemperature(70);          //setting current temperature to 70
		System.out.println(a1.temperature); //70
		
		a1.turnUpTemperature(13);      //turning up current temperature by 13
		System.out.println(a1.temperature); //83
				
		
	}
}
