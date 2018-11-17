package j000_Experiments;

public class One {
//instance variables
	String name;
	int age;
	char gender;
	String job;

	//1) Method take no argument and return nothing
	public void run() {
		System.out.println(name+ " is running.");
	}
	//2) Method take one argument and return nothing
	public void swim(int meters) {
		System.out.println(name+ " is swimming "+meters+" meters every day.");
	}
	//3) Method take no argument and return int.
	public int jumpBurnCalory() {
		System.out.println(name+" is jumping 10 minutes");
		return 10;
	}
}
