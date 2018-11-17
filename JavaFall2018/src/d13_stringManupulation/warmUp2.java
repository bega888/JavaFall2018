package d13_stringManupulation;

import java.util.Scanner;

public class warmUp2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	
		System.out.println("Enter two words each 5 character:");
		String firstW=input.next();
		String secondW=input.next();
		if(!(firstW.length()==5 && secondW.length()==5)) {
			System.out.println("need to be exactly 5 chars lenght");
		}else if(firstW.charAt(4)==secondW.charAt(0)) {
			System.out.println("Fizz");
		}else {
			System.out.println("Buzz - did not match");
		}
		
	}

}
