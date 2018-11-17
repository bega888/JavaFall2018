package j016_Switch;
import java.util.Scanner;
public class SeasonalDrink {
public static void main(String[] args) {
	int month;
	Scanner intake=new Scanner(System.in);
	
//	System.out.println("Please enter month number: ");
//	month=intake.nextInt();
	
//	if(month==12 || month <=2) {
//		System.out.println("Season: Winter \n Drink: Pumpkin Spice");
//	}else if(month<=5) {
//		System.out.println("Season: Spring \n Drink: Caramel Macchiato");
//	}else if(month>5 && month<9) {
//		System.out.println("Season: Summer \n Drink: Iced Coffee");
//	}else if(month==9 || month==10 || month==11) {
//		System.out.println("Season: Fall \n Drink: Salted Caramel Mocha");
//	}else {
//		System.out.println("Such month does not exist !!!");
//	}
//	
	int n= 5;
	if(n>7) {
		System.out.println("it is greater than 7");
	}else if(n>4) {
		System.out.println("it is greater than 17");
	}else if(n>0) {
		System.out.println("it is greater than 0");
	}else {
		System.out.println("what is n's value?");
	}

}
}

