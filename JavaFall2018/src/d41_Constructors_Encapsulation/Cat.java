package d41_Constructors_Encapsulation;

public class Cat {
	
	String gender;
	String breed;
	String color;
	String behavior; 
	boolean shy;
	int age;
	
	
	
	public void eat() {
		System.out.println("Cat is eating");
	}
	
	public Cat(String gender1, String breed1) {
		gender=gender1;
		breed=breed1;
		System.out.println("Cat constructor is getting called");
	}
	
	public Cat(String gender1, String breed1, int age1) {
		gender=gender1;
		breed=breed1;
		age=age1;
		System.out.println("Cat constructor is getting called");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
