package j017_WhileLoop;
import java.util.Scanner;
public class EnterN1 {
public static void main(String[] args) {
	Scanner intake=new Scanner(System.in);
	
	System.out.println("Enter number 1");
	int num=intake.nextInt();
	
//	while(num !=1){
//		System.out.println("I said enter 1");
//		num=intake.nextInt();            //pay attention
//	}
	do {
		System.out.println("Enter number 1");
		num=intake.nextInt();
	}while(num !=1);
	
	System.out.println("Thank you!");
}
}
