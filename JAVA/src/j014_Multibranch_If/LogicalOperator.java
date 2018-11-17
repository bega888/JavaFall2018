package j014_Multibranch_If;

import java.util.Scanner;

public class LogicalOperator {
	public static void main(String[] args) {
		Scanner intake = new Scanner(System.in);

		System.out.println("Enter your name:");
		  String name = intake.next();
		  boolean startsWithA = name.startsWith("A");
		  boolean endsWithC = name.endsWith("C");
		  if (startsWithA && endsWithC) {
			System.out.println("bingo");
	    	} else {
			System.out.println("try another name");
		  }
		
	}
}
