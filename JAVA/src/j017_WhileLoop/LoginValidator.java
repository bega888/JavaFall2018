package j017_WhileLoop;

import java.util.Scanner;

public class LoginValidator {
	public static void main(String[] args) {
		String validUserName = "Murat";
		String validPassword = "murat123";

		Scanner intake = new Scanner(System.in);
		// get username
		System.out.println("Enter Username:");
		String userName = intake.nextLine(); // .nextLine allows ""-blank
		// get password
		System.out.println("Enter Password");
		String password = intake.nextLine();

		// positive senario
		if (userName.equalsIgnoreCase(validUserName) && password.equals(validPassword)) {
			System.out.println("Login successful - Welcome Back!");
		} else {
			if (userName.equals("") || password.isEmpty()) {
				if (userName.isEmpty()) {
					System.out.println("Username cannot be blank");
				}
				if (password.isEmpty()) {
					System.out.println("Password cannot be blank");
				}
			}else if(!userName.equalsIgnoreCase(validUserName)) {
				System.out.println("Invalid Username");
			}if(!password.equals(validPassword)) {
				System.out.println("Invalid password");
			}
		}
	}
}
