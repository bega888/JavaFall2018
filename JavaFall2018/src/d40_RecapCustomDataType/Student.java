package d40_RecapCustomDataType;

public class Student {
	String name;
	int age;
	String email;
	
	public void read() {
		System.out.println("Student "+name+" is reading");
	}
	public void read(Book b1) {
		System.out.println("Student "+name+" is reading "+b1.title+" by "+b1.author);
	}
	
	

}
