package d20_Loops3_ForLoop;

import java.util.Scanner;

public class WarmUpTask {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1=input.nextInt();
		int num2=input.nextInt();
		
		while(num1>num2) {
			System.out.println("Step "+num1--);
		}while(num1<num2) {
			System.out.println("Step "+num1++);
		}
		
		
		
		
		
		
		String word=input.nextLine();
		while(word.length()>0) {
			System.out.print(word.charAt(0));
		}
		
		
		
		
		
		
		
		
		 
	}

}
