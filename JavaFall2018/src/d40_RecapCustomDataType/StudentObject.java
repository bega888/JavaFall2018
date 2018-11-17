package d40_RecapCustomDataType;

public class StudentObject {
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.name="Josh";
		s1.age=23;
		s1.email="josh88@gmail.com";
		
		s1.read();
		
		
		Book b1=new Book();
		b1.author="Grant Cardone";
		b1.title="10X Rule";
		b1.pages=135;
		
		s1.read(b1);
		
			
	}
}
