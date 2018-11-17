package d13_stringManupulation;

public class stringEquality {
	public static void main(String[] args) {
		// == is an operator to check if two values are the same, and it works with primitives only
		// 100==100; -> true,    int n1=20 & int n2=30   n1==n2 -> false.
		/*
		 * String str1="abc";
		 * String str2="abc";
		 * str1==str2; -> true
		 * 
		 * String str1=new String("abc");
		 * String str2=new String("abc");
		 * str1==str2; -> false
		 * ========================================
		 * 
		 * Primitives data    System.out.println(a==b);                         ->boolean
		 * Object data        System.out.println(a.equals(b));                  ->boolean
		 * Object data        System.out.println(a.equalsIgnoreCase(b));        ->boolean
		 */
		
	String n1="Begmyrat";
	String n2="Begmyrat";
	String n3=new String("Begmyrat");
	String n4=new String("Begmyrat");
	System.out.println(n1==n2);             //true -> they are pointing to the same "Begmyrat"
	System.out.println(n1==n3);             //false -> they are pointing to the different "Begmyrat"
	System.out.println(n3.equals(n4));      //true -> they are pointing to the different "Begmyrat" but their values matches  
	System.out.println(n1.equals("Begmyrat"));
	
		
		
		
		
		
	}

}
