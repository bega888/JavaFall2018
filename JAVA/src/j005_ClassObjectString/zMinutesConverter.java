package j005_ClassObjectString;

public class zMinutesConverter {
	public static void main(String[] args) {
		
		int minutes=3456789;
		double days=minutes/60/24;
		double years=days/365;
		
		System.out.println(minutes+" minutes is approximately "+years+" years and "+days+" days.");
		
		
		
	}

}
