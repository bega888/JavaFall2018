package d10_conditionals4;

import java.util.Scanner;

public class FindASeason {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter month number:");
		int month=input.nextInt();
		if(month==12 || month==1 || month==2) {
			System.out.println("Winter");
		}else if(month==3 || month==4 || month==5) {  //(month >= 3 && month <= 5) also possible
			System.out.println("Spring");
		}else if(month==6 || month==7 || month==8) {
			System.out.println("Summer");
		}else if(month==9 || month==10 || month==11) {
			System.out.println("Fall");
		}else {
			System.out.println("Invalid month number. Enter between 1-12");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
