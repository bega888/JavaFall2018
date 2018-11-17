package j011_ClassStructure;

public class MyStudentsMain {
public static void main(String[] args) {
	
	MyStudents s1=new MyStudents();
	s1.fullname="Seha Sahan";
	s1.age=24;
	s1.gender="Female";
	s1.address="Camlica mahallesi, gunes sokak 34/12, Eskisehir";
	s1.phonenumber="312-3303676";
	s1.email="s.sahan@anadolu.edu.tr";
	
	MyStudents s2=new MyStudents();
	s2.fullname="Burak Kavuncu";
	s2.age=25;
	s2.gender="Male";
	s2.address="Camlica mahallesi, belediye sokak 12/4, Eskisehir";
	s2.phonenumber="312-6643456";
	s2.email="kavuncu.burak@gmail.com";

	s2.StudentsInfo();
	
	
}
}
