package d31_MethodsPractice;

import java.util.Scanner;

public class VAcMethodsWithConditions {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1=input.nextInt();
		int num2=input.nextInt();
		
		getMax(num1, num2);
		
		steps(5);
	}

	public static void getMax(int a, int b) {
		if(a>b) {
			System.out.println(a);
		}else if(b>a) {
			System.out.println(b);
		}else {
			System.out.println("They are equal");
		}
	}

	public static void steps(int x) {
		if (x<0) {
			System.out.println("Jump");
		}else if(x==0) {
			System.out.println("Sit");
		}else if(x>0) {
			for(int i=1; i<=x; i++){
			System.out.println("Step "+i);
			}
		}
	}
	
	
	
	
	
}



