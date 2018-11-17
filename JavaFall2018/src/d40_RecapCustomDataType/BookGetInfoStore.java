package d40_RecapCustomDataType;

import java.util.Scanner;

public class BookGetInfoStore {
	public static void main(String[] args) {
				
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter total books:");
		int totalBooksEntered=input.nextInt();
		input.nextLine();
	
		
		for (int i=1; i<=totalBooksEntered; i++) {
			Book book=new Book();
			
			System.out.println("Please enter title for book "+i+ ":");
			book.title=input.nextLine();
			System.out.println("Please enter author for book "+i+":");
			book.author=input.nextLine();
			System.out.println("Please enter pages for book "+i+":");
			book.pages=input.nextInt();
			input.nextLine();
		}
		System.out.println("Total books entered: "+totalBooksEntered);
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
