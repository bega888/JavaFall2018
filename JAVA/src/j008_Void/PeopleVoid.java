package j008_Void;

public class PeopleVoid {
public static void main(String[] args) {
	
	Person p1=new Person();
	p1.name="Mike";
	p1.job="JAVA Developer";
	p1.swim();
	p1.run();
	p1.bike(12);
	System.out.println("----------------");
	Person p2=new Person();
	p2.name="Bob";
	p2.job="Pythod Developer";
	p2.swim();
	p2.run();
	p2.bike(10);
	p2.say("hi");
	
	
	
}
}
