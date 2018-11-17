package d14_stringManipulationContinued;

import java.util.Scanner;

public class getPartOfString {
	public static void main(String[] args) {
		//what is your email
		//some@gmail.com
		//oh so you have gmail
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your email:");
		String email="bega888@bk.ru";
		System.out.println("Oh so you use: "+email.substring(8, 13)+", that is really cool!");
	
		//find the location of @ and ., then will substring the end
		int start=email.indexOf("@");
		int end=email.indexOf(".");
		System.out.println("Oh so you use: "+email.substring(++start)+", that is really cool!");
		System.out.println("Oh so you use: "+email.substring(start, end)+", that is really cool!");
		
		
		//Challange: how can you handle b@gurbansahedov88@anadolu.edu.tr
		
		
		
		
	}

}
