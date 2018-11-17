package d17_ReviewSession2;

public class bStrings01 {
	public static void main(String[] args) {
		 String greeting = "Hello World!";
		 System.out.println(greeting.length());	//	12
		 
		 int length=greeting.length();
		 System.out.println(length);	//	12
		 
		 char ch1=greeting.charAt(0);		
		 System.out.println(ch1);
		 char ch2=greeting.charAt(11); // position counting from 0, so we use 11 instead of 12
	//	 char ch3=greeting.charAt(length);	//	StringIndexOutOfBoundsException
		 char ch4=greeting.charAt(length-1); //charAt(0)-always first letter, charAt(length-1)-always last letter
		 char lst=greeting.charAt(greeting.length()-1);  // ==> this is way better, when String get manipulated your code will not be broken
		 System.out.println(ch2+""+lst);
		
		
		
		
		
		
		
		
	}

}
