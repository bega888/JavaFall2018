package d13_stringManupulation;

import java.util.Scanner;

public class warmUp1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st word:");
		String first=input.next();
		System.out.println("Enter 2nd word:");
		String second=input.next();
		System.out.println("Enter 3rd word:");
		String third=input.next();
		
		int firstLength=first.length();
		int secondLength=second.length();
		int thirdLength=third.length();
		System.out.println(firstLength);
		System.out.println(secondLength);
		System.out.println(thirdLength);
	
		if(firstLength==secondLength && firstLength==thirdLength) {
			System.out.println("All words are the same lenght");
			}else if(firstLength==secondLength || firstLength==thirdLength || secondLength==thirdLength) {
				System.out.println("Not Same not Different length");
			}else {
				System.out.println("All different lenght");
			}
		
		
		
		
	}

}
