package d13_stringManupulation;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		String secretUserName="admin";
		String secretPassword="abc123";
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your username:");
		String userName=input.next();
		System.out.println("Enter your password:");
		String userPassword=input.next();
		
		if(userName.equalsIgnoreCase(secretUserName) && userPassword.equals(secretPassword)) {
			System.out.println("Login successful");
		}else if(userName.equalsIgnoreCase(secretUserName) && (!(userPassword.equals(secretPassword)))){
			System.out.println("ERROR: Invalid Password");
		}else if(!(userName.equalsIgnoreCase(secretUserName)) && userPassword.equals(secretPassword)){
			System.out.println("ERROR: Invalid Username");
		}else {
			System.out.println("ERROR: Invalid username or password");
		}
		
		
		
	}

}
