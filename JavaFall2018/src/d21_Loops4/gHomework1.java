package d21_Loops4;

import java.util.Scanner;

public class gHomework1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any number:");
		int number=input.nextInt();
		String nNumber=Integer.toString(number);
		String reversed="";
		
		for(int i=nNumber.length()-1; i>=0; i--) {
			reversed=reversed+nNumber.charAt(i);
		}
		System.out.println(reversed);
		System.out.println(number);
		
		if(reversed.equals(number)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
		
		
		
		
		
		
		
		
		
	}

}
