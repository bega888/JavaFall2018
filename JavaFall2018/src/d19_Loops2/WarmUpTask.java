package d19_Loops2;

import java.util.Scanner;

public class WarmUpTask {
	public static void main(String[] args) {
		int a=1, b=10;
//-------------------		
		while(a<=10){
			System.out.print(a+", ");
			a++;
			if(a==11) {
				System.out.println("");
			}
		}
//---------------------
		while(b>0) {
			System.out.print(b+", ");
			b--;
		}
//---------------------
		Scanner input=new Scanner(System.in);
		System.out.println("Print a word:");
		String word=input.nextLine();
		String firstLetter=word.substring(0, 1).toUpperCase();
		String remainingLetters=word.substring(1, word.length()).toLowerCase();
		System.out.println(firstLetter+remainingLetters);
// above is fine but the one below is much better		
		String word1="turKMENistaN";
		word1=word1.substring(0, 1).toUpperCase()+word1.substring(1).toLowerCase();
		System.out.println(word1);
		
		
		
		
	}

}
