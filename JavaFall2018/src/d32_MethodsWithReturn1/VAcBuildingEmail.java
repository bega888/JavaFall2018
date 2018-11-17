package d32_MethodsWithReturn1;

public class VAcBuildingEmail {
	public static void main(String[] args) {
	String firstName=getFirstName();	
	String lastName=getLastName();	
	String email=firstName+"_"+lastName+"@gmail.com";
	System.out.println(email);	
		
	}
public static String getFirstName() {
	return "Murat";
}
public static String getLastName() {
	return "Sahat";
}
	
}
