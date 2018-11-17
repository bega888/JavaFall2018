package j008_Void;

public class People {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.name="Venkat";
		p1.age=34;
		p1.gender='M';
		p1.job="QAM";
		p1.salary=86000;
		Person p2=new Person();
		p2.name="Maruf";
		p2.age=37;
		p2.gender='M';
		p2.job="BA";
		p2.salary=75000;
		System.out.println(p1.name+" is a "+p1.job+", and "+p2.name+" is a "+p2.job);
		p2.name="Handan";
		p1.job=p2.job;
		System.out.println(p2.name+" is a "+p2.job);
		
		
		
	}
}
