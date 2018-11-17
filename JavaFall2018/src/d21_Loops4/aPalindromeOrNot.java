package d21_Loops4;

import java.util.Scanner;

public class aPalindromeOrNot {
	public static void main(String[] args) {
	// task1-print names reversed order
		
		String word="hello";
		String reversed="";
		
		for(int idx=word.length()-1; idx>=0; idx--) {
			reversed = reversed + word.charAt(idx);
		}
		System.out.print(reversed);
		System.out.println("");
		System.out.println(word);
		
		if(word.equals(reversed)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
	}

}
