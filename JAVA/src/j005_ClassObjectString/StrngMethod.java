package j005_ClassObjectString;

public class StrngMethod {
	public static void main(String[] args) {
		String country=new String(" Turkmenistan ");
		country.toUpperCase();
		System.out.println(country.toUpperCase());
		System.out.println(country.toLowerCase());
		System.out.println(country.startsWith("t"));
		System.out.println(country.endsWith(" "));
		System.out.println(country.contains("ta"));
		System.out.println(country.charAt(0));
		System.out.println(country.indexOf(5));
		System.out.println(country.substring(4));
		System.out.println(country.trim());
		
		
		
	}
}
