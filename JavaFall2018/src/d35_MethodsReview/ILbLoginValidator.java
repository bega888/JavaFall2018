package d35_MethodsReview;

import java.util.Arrays;
import java.util.Scanner;

public class ILbLoginValidator {
	public static void main(String[] args) {
		
	login("johnJava", "123456");
		



	}
	public static void login(String inputName, String inputPassword) {
		String givenID="johnJava";
		String givenPassword="123456";
		if(inputName==givenID && inputPassword==givenPassword) {
			System.out.println("Login Successful!");
		}else {
			System.out.println("Either your password or your accountID is not correct!");
		}
		
		
	}
	
	//.equal method also should work, but do they same???
	
	
	
	
	
	
}
