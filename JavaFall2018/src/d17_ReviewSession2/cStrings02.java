package d17_ReviewSession2;

import java.util.Scanner;

public class cStrings02 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Type a words and press Enter:");
		String str1=input.nextLine();
		
		if(str1.length()>=4) {
			if(str1.charAt(0)==str1.charAt(str1.length()-1)) {
				System.out.println("first and last characters are same");
			}if((str1.charAt(0+1)==str1.charAt(str1.length()-2)) ) {
				System.out.println("Second letter and the second from the last are same");			
			}
		}else {
			System.out.println("Not enough characters, words must have at least 4 letters");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
