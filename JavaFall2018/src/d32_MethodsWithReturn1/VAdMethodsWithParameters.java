package d32_MethodsWithReturn1;

public class VAdMethodsWithParameters {
	public static void main(String[] args) {
		
	String newemail=buildEmail("Begmyrat", "Gurbansahedov");	
	System.out.println(newemail );	
		
	}
public static String buildEmail(String firstName, String lastName) {
	String email=firstName+"_"+lastName+"@gmail.com";
	return email;
}
	
	
	
	
	
}
