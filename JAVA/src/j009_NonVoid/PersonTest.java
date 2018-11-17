package j009_NonVoid;

public class PersonTest {
public static void main(String[] args) {
	Person p1=new Person();
	p1.name="Alisher";
	p1.age=37;
	
	int age1=p1.getAge();   //storing the value
	System.out.println(age1);
	
	int getTen=p1.get10();
	System.out.println("getting ten: "+getTen);
	
	String name=p1.name;
	System.out.println(name);
	
	
	
	
	
	
	
}
	
	
}
