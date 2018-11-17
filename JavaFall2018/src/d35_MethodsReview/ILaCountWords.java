package d35_MethodsReview;

import java.util.Arrays;
import java.util.Scanner;

public class ILaCountWords {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the word");
	String word=input.nextLine();
		
	countWords(word);	
		
	}
	public static void countWords(String str) {
		String[] splitStr=str.split(" ");
		String splitArr=Arrays.toString(splitStr);
		System.out.println("The values of the split is as followed: "+splitArr);
		System.out.println("The number of words in this sentence: "+splitStr.length);
	}
	
	
	
	
	
	
	
	
}
