package d15_stringManupMore;

import java.util.Scanner;

public class PasswordValidator {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your new password");
		String password=input.next();
		
		if(password.length()<8) {
			System.out.println("Password should contain minumum 8 characters");
			}else if(!(password.contains("ABCDEFGHIJKLMNOPQRSTUVWXYZ"))); {
				System.out.println("Password should contain at leeat 1 upper case");
				}if(!(password.contains("abcdefghijklmnopqrstuvwxyz"))); {
					System.out.println("Password should contain at leeat 1 lower case");
					}if(!(password.contains( " ~ ` ! @ # $ % ^ & * ( ) _- { } [ ] '\' | : ; '  ? / < > , . "))); {
						System.out.println("Password should contain at leeat 1 special caracter");
					//	}else{
							System.out.println("Your password is accepted");
							}

}
}