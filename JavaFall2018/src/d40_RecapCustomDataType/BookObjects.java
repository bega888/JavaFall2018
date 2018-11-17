package d40_RecapCustomDataType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookObjects {
	public static void main(String[] args) {
		
		Book b1=new Book();
		Book b2=new Book();
		Book b3=new Book();
		b1.title="GRIT";
		b1.author="Angela Duckworth";
		b1.pages=321;
		b2.title="Software Developers Guide";
		b2.author="John Sonmez";
		b2.pages=216;
		b3.title="10X Rule";
		b3.author="Grant Cardone";
		b3.pages=128;
		
		List<Book> bookList = new ArrayList<>();
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		for(Book b:bookList) {
			System.out.println(b.author);
		}	

		
	}
		
}


