package j009_NonVoid;

public class Person {
	String name;
	int age;
	
	public int getAge() {
		System.out.println("getting age: " +age );
		return age; 
	}
	public int get10() {
		System.out.println("getting ten ");
		return 10;
	}
	public  String getPersonName() {
		System.out.println("getting the name: ");
		return "person";
	}
	public String getName() {
		System.out.println("getting the name: ");
		return name;
	}
	
	

}
