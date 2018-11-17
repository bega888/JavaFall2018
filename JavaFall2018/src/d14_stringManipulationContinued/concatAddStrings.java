package d14_stringManipulationContinued;

import java.util.Scanner;

public class concatAddStrings {
	public static void main(String[] args) {
		String domain="@cybertekschool.com";
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your full name:");
		String fullName=input.next();
		System.out.println("This is your new school email ");
		System.out.println((fullName.concat(domain)));
	}

}
