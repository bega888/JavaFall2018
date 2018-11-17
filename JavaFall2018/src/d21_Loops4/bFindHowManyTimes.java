package d21_Loops4;

import java.util.Scanner;

public class bFindHowManyTimes {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a word:");
		String word=input.next().toLowerCase();
		System.out.println("Enter a character:");
		char ch=input.next().toLowerCase().charAt(0);

		int counter=0;
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)==ch) {
				counter++;
			}
		}
		System.out.println(counter);
		
		
		
		
		
		
		
		
	}

}
