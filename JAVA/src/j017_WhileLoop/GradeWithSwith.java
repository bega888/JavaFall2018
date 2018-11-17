package j017_WhileLoop;
import java.util.Scanner;
public class GradeWithSwith {
public static void main(String[] args) {
	Scanner intake=new Scanner(System.in);
	
	System.out.println("Enter the grade:");
	char grade=intake.next().charAt(0);
	
	switch(grade) {  //byte.short.int.String.enum
	case 'A':
		System.out.println("Excellent");
		break;
	case 'B':
		System.out.println("Good job");
		break;
	case 'C':
		System.out.println("Good");
		break;
	case 'D':
		System.out.println("Poor");
		break;
	case 'F':
		System.out.println("Fail");
		break;
	default:
		System.out.println("Invalid grade, only ABCDF grades allowed");

		
	}
	
	
	
}
}
